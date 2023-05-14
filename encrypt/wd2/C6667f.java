package wd2;

import java.io.PrintStream;
import xc2.C6743f;
import xd2.C6754a;
import xd2.C6755b;
import xd2.C6760g;
import xd2.C6764k;
import xd2.C6766m;

/* renamed from: wd2.f */
public class C6667f implements C6666e {

    /* renamed from: K0 */
    public C6743f f16566K0;

    /* renamed from: U0 */
    public final Object f16567U0;

    /* renamed from: k0 */
    public int f16568k0;

    public C6667f() {
        this.f16568k0 = 0;
        this.f16567U0 = this;
    }

    public C6667f(C6666e eVar) {
        this.f16568k0 = 0;
        this.f16567U0 = eVar;
    }

    /* renamed from: A0 */
    public void mo26838A0(C6743f fVar) {
        C6743f fVar2 = this.f16566K0;
        if (fVar2 == null) {
            this.f16566K0 = fVar;
        } else if (fVar2 != fVar) {
            throw new IllegalStateException("Context has been already set");
        }
    }

    /* renamed from: L */
    public void mo26839L(String str) {
        mo26841O0(new C6766m(str, mo32226w1()));
    }

    /* renamed from: M0 */
    public C6764k mo32225M0() {
        C6743f fVar = this.f16566K0;
        if (fVar == null) {
            return null;
        }
        return fVar.mo32549M0();
    }

    /* renamed from: O */
    public void mo26840O(String str, Throwable th) {
        mo26841O0(new C6754a(str, mo32226w1(), th));
    }

    /* renamed from: O0 */
    public void mo26841O0(C6760g gVar) {
        C6743f fVar = this.f16566K0;
        if (fVar == null) {
            int i = this.f16568k0;
            this.f16568k0 = i + 1;
            if (i == 0) {
                PrintStream printStream = System.out;
                printStream.println("LOGBACK: No context given for " + this);
                return;
            }
            return;
        }
        C6764k M0 = fVar.mo32549M0();
        if (M0 != null) {
            M0.mo32534a(gVar);
        }
    }

    /* renamed from: a1 */
    public void mo26843a1(String str) {
        mo26841O0(new C6755b(str, mo32226w1()));
    }

    /* renamed from: b */
    public void mo26844b(String str, Throwable th) {
        mo26841O0(new C6766m(str, mo32226w1(), th));
    }

    /* renamed from: d */
    public void mo26847d(String str, Throwable th) {
        mo26841O0(new C6755b(str, mo32226w1(), th));
    }

    public C6743f getContext() {
        return this.f16566K0;
    }

    /* renamed from: w1 */
    public Object mo32226w1() {
        return this.f16567U0;
    }

    /* renamed from: z0 */
    public void mo26862z0(String str) {
        mo26841O0(new C6754a(str, mo32226w1()));
    }
}
