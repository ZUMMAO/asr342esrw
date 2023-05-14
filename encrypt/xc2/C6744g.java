package xc2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import wd2.C6674m;
import wd2.C6675n;
import xd2.C6764k;
import zd2.C6953l;

/* renamed from: xc2.g */
public class C6744g implements C6743f, C6674m {

    /* renamed from: K0 */
    public String f16853K0;

    /* renamed from: U0 */
    public C6764k f16854U0 = new C6741d();

    /* renamed from: V0 */
    public Map<String, String> f16855V0 = new HashMap();

    /* renamed from: W0 */
    public Map<String, Object> f16856W0 = new HashMap();

    /* renamed from: X0 */
    public C6675n f16857X0 = new C6675n();

    /* renamed from: Y0 */
    public volatile ExecutorService f16858Y0;

    /* renamed from: Z0 */
    public C6749l f16859Z0;

    /* renamed from: a1 */
    public boolean f16860a1;

    /* renamed from: k0 */
    public long f16861k0 = System.currentTimeMillis();

    /* renamed from: B0 */
    public void mo32547B0(C6674m mVar) {
        mo32555b().mo32573a(mVar);
    }

    /* renamed from: H */
    public ExecutorService mo32548H() {
        if (this.f16858Y0 == null) {
            synchronized (this) {
                if (this.f16858Y0 == null) {
                    this.f16858Y0 = C6953l.m23553a();
                }
            }
        }
        return this.f16858Y0;
    }

    /* renamed from: M0 */
    public C6764k mo32549M0() {
        return this.f16854U0;
    }

    /* renamed from: V */
    public void mo32550V(String str, Object obj) {
        this.f16856W0.put(str, obj);
    }

    /* renamed from: X */
    public Object mo32551X() {
        return this.f16857X0;
    }

    /* renamed from: a */
    public Map<String, String> mo27520a() {
        return new HashMap(this.f16855V0);
    }

    /* renamed from: a0 */
    public long mo32552a0() {
        return this.f16861k0;
    }

    /* renamed from: b */
    public synchronized C6749l mo32555b() {
        if (this.f16859Z0 == null) {
            this.f16859Z0 = new C6749l();
        }
        return this.f16859Z0;
    }

    /* renamed from: c */
    public void mo26278c() {
        mo32555b().mo32574b();
        this.f16855V0.clear();
        this.f16856W0.clear();
    }

    /* renamed from: c1 */
    public Object mo32553c1(String str) {
        return this.f16856W0.get(str);
    }

    /* renamed from: d */
    public void mo32556d(C6764k kVar) {
        if (kVar != null) {
            this.f16854U0 = kVar;
            return;
        }
        throw new IllegalArgumentException("null StatusManager not allowed");
    }

    /* renamed from: e */
    public final synchronized void mo32557e() {
        if (this.f16858Y0 != null) {
            C6953l.m23554b(this.f16858Y0);
            this.f16858Y0 = null;
        }
    }

    public String getName() {
        return this.f16853K0;
    }

    public String getProperty(String str) {
        return C6745h.f16877P.equals(str) ? getName() : this.f16855V0.get(str);
    }

    /* renamed from: i1 */
    public void mo26284i1(String str, String str2) {
        this.f16855V0.put(str, str2);
    }

    public boolean isStarted() {
        return this.f16860a1;
    }

    public void setName(String str) throws IllegalStateException {
        if (str == null || !str.equals(this.f16853K0)) {
            String str2 = this.f16853K0;
            if (str2 == null || "default".equals(str2)) {
                this.f16853K0 = str;
                return;
            }
            throw new IllegalStateException("Context has been already given a name");
        }
    }

    public void start() {
        this.f16860a1 = true;
    }

    public void stop() {
        mo32557e();
        this.f16860a1 = false;
    }

    public String toString() {
        return this.f16853K0;
    }
}
