package as0;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xc2.C6745h;

@Metadata(mo78582bv = {}, mo78583d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u000f"}, mo78584d2 = {"Las0/d;", "", "", "toString", "nonce", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "serverDLBv1", "b", "d", "<init>", "()V", "keyExchange_release"}, mo78585k = 1, mo78586mv = {1, 4, 0})
/* renamed from: as0.d */
/* compiled from: KeyExchangeResponse.kt */
public final class C27190d {
    @SerializedName("nonce")
    @Nullable

    /* renamed from: a */
    public String f64897a;
    @SerializedName("serverDLBv1")
    @Nullable

    /* renamed from: b */
    public String f64898b;

    @Nullable
    /* renamed from: a */
    public final String mo121937a() {
        return this.f64897a;
    }

    @Nullable
    /* renamed from: b */
    public final String mo121938b() {
        return this.f64898b;
    }

    /* renamed from: c */
    public final void mo121939c(@Nullable String str) {
        this.f64897a = str;
    }

    /* renamed from: d */
    public final void mo121940d(@Nullable String str) {
        this.f64898b = str;
    }

    @NotNull
    public String toString() {
        return "KeyExchangeResponse{nonce='" + this.f64897a + C6745h.f16920z + ", serverDLBv1='" + this.f64898b + C6745h.f16920z + '}';
    }
}
