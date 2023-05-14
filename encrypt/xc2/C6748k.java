package xc2;

import wd2.C6667f;

/* renamed from: xc2.k */
public abstract class C6748k<E> extends C6667f implements C6747j<E> {

    /* renamed from: V0 */
    public boolean f16926V0;

    /* renamed from: W0 */
    public String f16927W0;

    /* renamed from: X0 */
    public String f16928X0;

    /* renamed from: Y0 */
    public String f16929Y0;

    /* renamed from: Z0 */
    public String f16930Z0;

    /* renamed from: A0 */
    public void mo26838A0(C6743f fVar) {
        this.f16566K0 = fVar;
    }

    /* renamed from: A1 */
    public void mo32569A1(String str) {
        this.f16929Y0 = str;
    }

    /* renamed from: V0 */
    public String mo26317V0() {
        return this.f16929Y0;
    }

    /* renamed from: W0 */
    public String mo26318W0() {
        return this.f16928X0;
    }

    public String getContentType() {
        return "text/plain";
    }

    public C6743f getContext() {
        return this.f16566K0;
    }

    public boolean isStarted() {
        return this.f16926V0;
    }

    /* renamed from: l0 */
    public String mo26320l0() {
        return this.f16927W0;
    }

    /* renamed from: q0 */
    public String mo26321q0() {
        return this.f16930Z0;
    }

    public void start() {
        this.f16926V0 = true;
    }

    public void stop() {
        this.f16926V0 = false;
    }

    /* renamed from: x1 */
    public void mo32570x1(String str) {
        this.f16928X0 = str;
    }

    /* renamed from: y1 */
    public void mo32571y1(String str) {
        this.f16927W0 = str;
    }

    /* renamed from: z1 */
    public void mo32572z1(String str) {
        this.f16930Z0 = str;
    }
}
