package as0;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p606r9.C20571b;
import p616s9.C20662f;
import xa3.C18676l0;
import xc2.C6745h;
import zr0.C29046a;

@Metadata(mo78582bv = {}, mo78583d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u0011"}, mo78584d2 = {"Las0/c;", "Ls9/f;", "", "getBody", "", "getEndpoint", "Lr9/b;", "getHttpMethod", "", "p", "isShouldEncrypt", "Lorg/json/JSONObject;", "getHeaders", "toString", "dlbClientKey", "<init>", "(Ljava/lang/String;)V", "keyExchange_release"}, mo78585k = 1, mo78586mv = {1, 4, 0})
/* renamed from: as0.c */
/* compiled from: KeyExchangeRequest.kt */
public final class C27189c extends C20662f {

    /* renamed from: a */
    public final String f64896a;

    public C27189c(@NotNull String str) {
        C18676l0.m64586q(str, "dlbClientKey");
        this.f64896a = str;
        this.endpoint = getEndpoint();
        this.headers = getHeaders();
        this.httpMethod = getHttpMethod();
    }

    @NotNull
    public Object getBody() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dlbClientKey", this.f64896a);
            return jSONObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    @NotNull
    public String getEndpoint() {
        return C29046a.KEY_EXCHANGE.getEndpoint();
    }

    public /* bridge */ /* synthetic */ Boolean getHasToken() {
        return Boolean.valueOf(mo121935p());
    }

    @NotNull
    public JSONObject getHeaders() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Content-Type", "application/json");
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    @NotNull
    public C20571b getHttpMethod() {
        return C20571b.POST;
    }

    public boolean isShouldEncrypt() {
        return false;
    }

    /* renamed from: p */
    public boolean mo121935p() {
        return false;
    }

    @NotNull
    public String toString() {
        return "KeyExchangeRequest{dlbClientKey='" + this.f64896a + C6745h.f16920z + '}';
    }
}
