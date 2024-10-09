package okhttp3;

import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class Headers$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ Class m() {
        return BasicFileAttributes.class;
    }

    public static /* bridge */ /* synthetic */ DirectoryStream m(Object obj) {
        return (DirectoryStream) obj;
    }

    public static /* synthetic */ FileSystemException m(String str, String str2, String str3) {
        return new FileSystemException(str, str2, str3);
    }

    public static /* synthetic */ FileSystemLoopException m(String str) {
        return new FileSystemLoopException(str);
    }

    /* renamed from: m */
    public static /* synthetic */ NoSuchFileException m2262m(String str, String str2, String str3) {
        return new NoSuchFileException(str, str2, str3);
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ SecureDirectoryStream m2265m(Object obj) {
        return (SecureDirectoryStream) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ BasicFileAttributeView m2268m(Object obj) {
        return (BasicFileAttributeView) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ BasicFileAttributes m2269m(Object obj) {
        return (BasicFileAttributes) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ FileAttributeView m2270m(Object obj) {
        return (FileAttributeView) obj;
    }

    /* renamed from: m */
    public static /* synthetic */ void m2278m() {
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m2280m(Object obj) {
        return obj instanceof SecureDirectoryStream;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m2281m(Path path) {
        return Files.isSymbolicLink(path);
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return BasicFileAttributeView.class;
    }

    /* renamed from: m$1 */
    public static /* synthetic */ void m2290m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return FileAttributeView.class;
    }
}
