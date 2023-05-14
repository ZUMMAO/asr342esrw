package xc2;

import ad2.C3121c;
import ad2.C3124f;
import java.io.IOException;
import java.io.OutputStream;
import wd2.C6670i;
import wd2.C6675n;
import xd2.C6754a;

/* renamed from: xc2.n */
public class C6751n<E> extends C6753p<E> {

    /* renamed from: c1 */
    public C3121c<E> f16932c1;

    /* renamed from: d1 */
    public C6675n f16933d1 = new C6675n();

    /* renamed from: e1 */
    public OutputStream f16934e1;

    /* renamed from: A1 */
    public void mo32576A1() {
        OutputStream outputStream;
        C3121c<E> cVar = this.f16932c1;
        if (cVar != null && (outputStream = this.f16934e1) != null) {
            try {
                cVar.mo20435d1(outputStream);
            } catch (IOException e) {
                this.f16936V0 = false;
                mo26841O0(new C6754a("Failed to initialize encoder for appender named [" + this.f16938X0 + "].", this, e));
            }
        }
    }

    /* renamed from: B1 */
    public C3121c<E> mo32577B1() {
        return this.f16932c1;
    }

    /* renamed from: C1 */
    public OutputStream mo32578C1() {
        return this.f16934e1;
    }

    /* renamed from: D1 */
    public void mo32579D1(C3121c<E> cVar) {
        this.f16932c1 = cVar;
    }

    /* renamed from: E1 */
    public void mo32580E1(C6747j<E> jVar) {
        mo26839L("This appender no longer admits a layout as a sub-component, set an encoder instead.");
        mo26839L("To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.");
        mo26839L("See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details");
        C3124f fVar = new C3124f();
        fVar.mo20453E1(jVar);
        fVar.mo26838A0(this.f16566K0);
        this.f16932c1 = fVar;
    }

    /* renamed from: F1 */
    public void mo32581F1(OutputStream outputStream) {
        synchronized (this.f16933d1) {
            mo32582y1();
            this.f16934e1 = outputStream;
            if (this.f16932c1 == null) {
                mo26839L("Encoder has not been set. Cannot invoke its init method.");
            } else {
                mo32576A1();
            }
        }
    }

    /* renamed from: G1 */
    public void mo31393G1(E e) {
        if (isStarted()) {
            try {
                if (e instanceof C6670i) {
                    ((C6670i) e).mo31713a();
                }
                synchronized (this.f16933d1) {
                    mo32558H1(e);
                }
            } catch (IOException e2) {
                this.f16936V0 = false;
                mo26841O0(new C6754a("IO failure in appender", this, e2));
            }
        }
    }

    /* renamed from: H1 */
    public void mo32558H1(E e) throws IOException {
        this.f16932c1.mo20433K0(e);
    }

    public void start() {
        int i;
        if (this.f16932c1 == null) {
            mo26841O0(new C6754a("No encoder set for the appender named \"" + this.f16938X0 + "\".", this));
            i = 1;
        } else {
            i = 0;
        }
        if (this.f16934e1 == null) {
            mo26841O0(new C6754a("No output stream set for the appender named \"" + this.f16938X0 + "\".", this));
            i++;
        }
        if (i == 0) {
            super.start();
        }
    }

    public void stop() {
        synchronized (this.f16933d1) {
            mo32582y1();
            super.stop();
        }
    }

    /* renamed from: x1 */
    public void mo26470x1(E e) {
        if (isStarted()) {
            mo31393G1(e);
        }
    }

    /* renamed from: y1 */
    public void mo32582y1() {
        if (this.f16934e1 != null) {
            try {
                mo32583z1();
                this.f16934e1.close();
                this.f16934e1 = null;
            } catch (IOException e) {
                mo26841O0(new C6754a("Could not close output stream for OutputStreamAppender.", this, e));
            }
        }
    }

    /* renamed from: z1 */
    public void mo32583z1() {
        C3121c<E> cVar = this.f16932c1;
        if (cVar != null && this.f16934e1 != null) {
            try {
                cVar.close();
            } catch (IOException e) {
                this.f16936V0 = false;
                mo26841O0(new C6754a("Failed to write footer for appender named [" + this.f16938X0 + "].", this, e));
            }
        }
    }
}
