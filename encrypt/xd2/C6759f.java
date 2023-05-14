package xd2;

import java.io.PrintStream;
import wd2.C6667f;
import wd2.C6674m;
import zd2.C6963t;

/* renamed from: xd2.f */
public abstract class C6759f extends C6667f implements C6762i, C6674m {

    /* renamed from: X0 */
    public static final long f16942X0 = 300;

    /* renamed from: V0 */
    public boolean f16943V0 = false;

    /* renamed from: W0 */
    public long f16944W0 = 300;

    /* renamed from: A1 */
    public final void mo32589A1() {
        if (this.f16566K0 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (C6760g next : this.f16566K0.mo32549M0().mo32538d()) {
                if (currentTimeMillis - next.mo32592b().longValue() < this.f16944W0) {
                    mo32590z1(next);
                }
            }
        }
    }

    /* renamed from: B1 */
    public void mo32586B1(long j) {
        this.f16944W0 = j;
    }

    public boolean isStarted() {
        return this.f16943V0;
    }

    /* renamed from: n0 */
    public void mo32585n0(C6760g gVar) {
        if (this.f16943V0) {
            mo32590z1(gVar);
        }
    }

    public void start() {
        this.f16943V0 = true;
        if (this.f16944W0 > 0) {
            mo32589A1();
        }
    }

    public void stop() {
        this.f16943V0 = false;
    }

    /* renamed from: x1 */
    public abstract PrintStream mo32587x1();

    /* renamed from: y1 */
    public long mo32588y1() {
        return this.f16944W0;
    }

    /* renamed from: z1 */
    public final void mo32590z1(C6760g gVar) {
        StringBuilder sb = new StringBuilder();
        C6963t.m23595b(sb, "", gVar);
        mo32587x1().print(sb);
    }
}
