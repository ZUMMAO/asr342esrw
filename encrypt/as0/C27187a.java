package as0;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xa3.C18676l0;
import xa3.C18716w;
import yr0.C28968b;

@Metadata(mo78582bv = {}, mo78583d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J3\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006#"}, mo78584d2 = {"Las0/a;", "", "Lyr0/b;", "a", "", "b", "c", "d", "securityKey", "hexEncodedServerPublicKey", "publicKey", "sEncryptedData", "e", "toString", "", "hashCode", "other", "", "equals", "Lyr0/b;", "j", "()Lyr0/b;", "n", "(Lyr0/b;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "k", "(Ljava/lang/String;)V", "h", "l", "i", "m", "<init>", "(Lyr0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "keyExchange_release"}, mo78585k = 1, mo78586mv = {1, 4, 0})
/* renamed from: C18676l0.a */
/* compiled from: KeyExchangeDataResult.kt */
public final class C27187a {
    @Nullable

    /* renamed from: a */
    public C28968b f64889a;
    @NotNull

    /* renamed from: b */
    public String f64890b;
    @NotNull

    /* renamed from: c */
    public String f64891c;
    @NotNull

    /* renamed from: d */
    public String f64892d;

    public C27187a(@Nullable C28968b bVar, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        C18676l0.m64586q(str, "hexEncodedServerPublicKey");
        C18676l0.m64586q(str2, "publicKey");
        C18676l0.m64586q(str3, "sEncryptedData");
        this.f64889a = bVar;
        this.f64890b = str;
        this.f64891c = str2;
        this.f64892d = str3;
    }

    /* renamed from: f */
    public static /* synthetic */ C27187a m95124f(C27187a aVar, C28968b bVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = aVar.f64889a;
        }
        if ((i & 2) != 0) {
            str = aVar.f64890b;
        }
        if ((i & 4) != 0) {
            str2 = aVar.f64891c;
        }
        if ((i & 8) != 0) {
            str3 = aVar.f64892d;
        }
        return aVar.mo121910e(bVar, str, str2, str3);
    }

    @Nullable
    /* renamed from: a */
    public final C28968b mo121906a() {
        return this.f64889a;
    }

    @NotNull
    /* renamed from: b */
    public final String mo121907b() {
        return this.f64890b;
    }

    @NotNull
    /* renamed from: c */
    public final String mo121908c() {
        return this.f64891c;
    }

    @NotNull
    /* renamed from: d */
    public final String mo121909d() {
        return this.f64892d;
    }

    @NotNull
    /* renamed from: e */
    public final C27187a mo121910e(@Nullable C28968b bVar, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        C18676l0.m64586q(str, "hexEncodedServerPublicKey");
        C18676l0.m64586q(str2, "publicKey");
        C18676l0.m64586q(str3, "sEncryptedData");
        return new C27187a(bVar, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27187a)) {
            return false;
        }
        C27187a aVar = (C27187a) obj;
        return C18676l0.m64576g(this.f64889a, aVar.f64889a) && C18676l0.m64576g(this.f64890b, aVar.f64890b) && C18676l0.m64576g(this.f64891c, aVar.f64891c) && C18676l0.m64576g(this.f64892d, aVar.f64892d);
    }

    @NotNull
    /* renamed from: g */
    public final String mo121912g() {
        return this.f64890b;
    }

    @NotNull
    /* renamed from: h */
    public final String mo121913h() {
        return this.f64891c;
    }

    public int hashCode() {
        C28968b bVar = this.f64889a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        String str = this.f64890b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f64891c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f64892d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    /* renamed from: i */
    public final String mo121915i() {
        return this.f64892d;
    }

    @Nullable
    /* renamed from: j */
    public final C28968b mo121916j() {
        return this.f64889a;
    }

    /* renamed from: k */
    public final void mo121917k(@NotNull String str) {
        C18676l0.m64586q(str, "<set-?>");
        this.f64890b = str;
    }

    /* renamed from: l */
    public final void mo121918l(@NotNull String str) {
        C18676l0.m64586q(str, "<set-?>");
        this.f64891c = str;
    }

    /* renamed from: m */
    public final void mo121919m(@NotNull String str) {
        C18676l0.m64586q(str, "<set-?>");
        this.f64892d = str;
    }

    /* renamed from: n */
    public final void mo121920n(@Nullable C28968b bVar) {
        this.f64889a = bVar;
    }

    @NotNull
    public String toString() {
        return "KeyExchangeDataResult(securityKey=" + this.f64889a + ", hexEncodedServerPublicKey=" + this.f64890b + ", publicKey=" + this.f64891c + ", sEncryptedData=" + this.f64892d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27187a(C28968b bVar, String str, String str2, String str3, int i, C18716w wVar) {
        this((i & 1) != 0 ? null : bVar, str, str2, str3);
    }
}
