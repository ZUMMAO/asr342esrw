package as0;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xa3.C18676l0;
import xa3.C18716w;

@Metadata(mo78582bv = {}, mo78583d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, mo78584d2 = {"Las0/b;", "Ljava/io/Serializable;", "", "a", "b", "c", "action", "code", "message", "d", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "h", "(Ljava/lang/String;)V", "getCode", "i", "g", "j", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "keyExchange_release"}, mo78585k = 1, mo78586mv = {1, 4, 0})
/* renamed from: as0.b */
/* compiled from: KeyExchangeErrorModel.kt */
public final class C27188b implements Serializable {
    @SerializedName("code")
    @Nullable
    @Expose

    /* renamed from: K0 */
    public String f64893K0;
    @SerializedName("message")
    @Nullable
    @Expose

    /* renamed from: U0 */
    public String f64894U0;
    @SerializedName("action")
    @Nullable
    @Expose

    /* renamed from: k0 */
    public String f64895k0;

    public C27188b() {
        this((String) null, (String) null, (String) null, 7, (C18716w) null);
    }

    public C27188b(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f64895k0 = str;
        this.f64893K0 = str2;
        this.f64894U0 = str3;
    }

    /* renamed from: e */
    public static /* synthetic */ C27188b m95138e(C27188b bVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f64895k0;
        }
        if ((i & 2) != 0) {
            str2 = bVar.f64893K0;
        }
        if ((i & 4) != 0) {
            str3 = bVar.f64894U0;
        }
        return bVar.mo121925d(str, str2, str3);
    }

    @Nullable
    /* renamed from: a */
    public final String mo121922a() {
        return this.f64895k0;
    }

    @Nullable
    /* renamed from: b */
    public final String mo121923b() {
        return this.f64893K0;
    }

    @Nullable
    /* renamed from: c */
    public final String mo121924c() {
        return this.f64894U0;
    }

    @NotNull
    /* renamed from: d */
    public final C27188b mo121925d(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new C27188b(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27188b)) {
            return false;
        }
        C27188b bVar = (C27188b) obj;
        return C18676l0.m64576g(this.f64895k0, bVar.f64895k0) && C18676l0.m64576g(this.f64893K0, bVar.f64893K0) && C18676l0.m64576g(this.f64894U0, bVar.f64894U0);
    }

    @Nullable
    /* renamed from: f */
    public final String mo121927f() {
        return this.f64895k0;
    }

    @Nullable
    /* renamed from: g */
    public final String mo121928g() {
        return this.f64894U0;
    }

    @Nullable
    public final String getCode() {
        return this.f64893K0;
    }

    /* renamed from: h */
    public final void mo121930h(@Nullable String str) {
        this.f64895k0 = str;
    }

    public int hashCode() {
        String str = this.f64895k0;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f64893K0;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f64894U0;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public final void mo121932i(@Nullable String str) {
        this.f64893K0 = str;
    }

    /* renamed from: j */
    public final void mo121933j(@Nullable String str) {
        this.f64894U0 = str;
    }

    @NotNull
    public String toString() {
        return "KeyExchangeErrorModel(action=" + this.f64895k0 + ", code=" + this.f64893K0 + ", message=" + this.f64894U0 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27188b(String str, String str2, String str3, int i, C18716w wVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
