package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class zaas extends zabf {
    private final /* synthetic */ zaak zagq;
    private final /* synthetic */ com.google.android.gms.signin.internal.zaj zagr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaas(zaar zaarVar, zabd zabdVar, zaak zaakVar, com.google.android.gms.signin.internal.zaj zajVar) {
        super(zabdVar);
        this.zagq = zaakVar;
        this.zagr = zajVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zaan() {
        this.zagq.zaa(this.zagr);
    }
}
