package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* compiled from: ClassifierBasedTypeConstructor.kt */
/* loaded from: classes3.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {
    private int hashCode;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public abstract ClassifierDescriptor mo1906getDeclarationDescriptor();

    protected abstract boolean isSameClassifier(ClassifierDescriptor classifierDescriptor);

    public int hashCode() {
        int identityHashCode;
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        ClassifierDescriptor mo1906getDeclarationDescriptor = mo1906getDeclarationDescriptor();
        if (hasMeaningfulFqName(mo1906getDeclarationDescriptor)) {
            identityHashCode = DescriptorUtils.getFqName(mo1906getDeclarationDescriptor).hashCode();
        } else {
            identityHashCode = System.identityHashCode(this);
        }
        this.hashCode = identityHashCode;
        return identityHashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassifierDescriptor mo1906getDeclarationDescriptor = mo1906getDeclarationDescriptor();
        ClassifierDescriptor mo1906getDeclarationDescriptor2 = typeConstructor.mo1906getDeclarationDescriptor();
        if (mo1906getDeclarationDescriptor2 != null && hasMeaningfulFqName(mo1906getDeclarationDescriptor) && hasMeaningfulFqName(mo1906getDeclarationDescriptor2)) {
            return isSameClassifier(mo1906getDeclarationDescriptor2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean areFqNamesEqual(ClassifierDescriptor first, ClassifierDescriptor second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (!Intrinsics.areEqual(first.getName(), second.getName())) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = first.getContainingDeclaration();
        for (DeclarationDescriptor containingDeclaration2 = second.getContainingDeclaration(); containingDeclaration != null && containingDeclaration2 != null; containingDeclaration2 = containingDeclaration2.getContainingDeclaration()) {
            if (containingDeclaration instanceof ModuleDescriptor) {
                return containingDeclaration2 instanceof ModuleDescriptor;
            }
            if (containingDeclaration2 instanceof ModuleDescriptor) {
                return false;
            }
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                return (containingDeclaration2 instanceof PackageFragmentDescriptor) && Intrinsics.areEqual(((PackageFragmentDescriptor) containingDeclaration).getFqName(), ((PackageFragmentDescriptor) containingDeclaration2).getFqName());
            }
            if ((containingDeclaration2 instanceof PackageFragmentDescriptor) || !Intrinsics.areEqual(containingDeclaration.getName(), containingDeclaration2.getName())) {
                return false;
            }
            containingDeclaration = containingDeclaration.getContainingDeclaration();
        }
        return true;
    }

    private final boolean hasMeaningfulFqName(ClassifierDescriptor classifierDescriptor) {
        ClassifierDescriptor classifierDescriptor2 = classifierDescriptor;
        return (ErrorUtils.isError(classifierDescriptor2) || DescriptorUtils.isLocal(classifierDescriptor2)) ? false : true;
    }
}
