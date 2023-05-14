package xc2;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import sd2.C6233b;
import y93.C18829c;
import zd2.C6952k;
import zd2.C6955n;

/* renamed from: xc2.i */
public class C6746i<E> extends C6751n<E> {

    /* renamed from: f1 */
    public boolean f16921f1 = true;

    /* renamed from: g1 */
    public String f16922g1 = null;

    /* renamed from: h1 */
    public boolean f16923h1 = false;

    /* renamed from: i1 */
    public boolean f16924i1 = false;

    /* renamed from: j1 */
    public boolean f16925j1 = false;

    /* renamed from: G1 */
    public void mo31393G1(E e) {
        if (!this.f16924i1 && this.f16925j1) {
            this.f16924i1 = true;
            try {
                mo32563N1(mo31394J1());
            } catch (IOException e2) {
                this.f16936V0 = false;
                mo26840O("openFile(" + this.f16922g1 + "," + this.f16921f1 + ") failed", e2);
            }
        }
        super.mo31393G1(e);
    }

    /* renamed from: H1 */
    public void mo32558H1(E e) throws IOException {
        if (this.f16923h1) {
            mo32565P1(e);
        } else {
            super.mo32558H1(e);
        }
    }

    /* renamed from: I1 */
    public final String mo32559I1(String str) {
        return (!C6952k.m23547a() || new File(str).isAbsolute()) ? str : C6955n.m23558B1(this.f16566K0.getProperty(C6745h.f16878Q), str);
    }

    /* renamed from: J1 */
    public String mo31394J1() {
        return this.f16922g1;
    }

    /* renamed from: K1 */
    public boolean mo32560K1() {
        return this.f16925j1;
    }

    /* renamed from: L1 */
    public boolean mo32561L1() {
        return this.f16921f1;
    }

    /* renamed from: M1 */
    public boolean mo32562M1() {
        return this.f16923h1;
    }

    /* renamed from: N1 */
    public boolean mo32563N1(String str) throws IOException {
        String I1 = mo32559I1(str);
        synchronized (this.f16933d1) {
            File file = new File(I1);
            if (C6955n.m23557A1(file) && !C6955n.m23559y1(file)) {
                mo26862z0("Failed to create parent directories for [" + file.getAbsolutePath() + C18829c.f46741g);
            }
            C6233b bVar = new C6233b(file, this.f16921f1);
            bVar.mo31230u(this.f16566K0);
            mo32581F1(bVar);
        }
        return true;
    }

    /* renamed from: O1 */
    public final String mo32564O1() {
        return this.f16922g1;
    }

    /* renamed from: P1 */
    public final void mo32565P1(E e) throws IOException {
        FileChannel x = ((C6233b) mo32578C1()).mo31219x();
        if (x != null) {
            FileLock fileLock = null;
            try {
                fileLock = x.lock();
                long position = x.position();
                long size = x.size();
                if (size != position) {
                    x.position(size);
                }
                super.mo32558H1(e);
            } finally {
                if (fileLock != null) {
                    fileLock.release();
                }
            }
        }
    }

    /* renamed from: Q1 */
    public void mo32566Q1(boolean z) {
        this.f16921f1 = z;
    }

    /* renamed from: R1 */
    public void mo31395R1(String str) {
        this.f16922g1 = str == null ? null : str.trim();
    }

    /* renamed from: S1 */
    public void mo32567S1(boolean z) {
        this.f16925j1 = z;
    }

    /* renamed from: T1 */
    public void mo32568T1(boolean z) {
        this.f16923h1 = z;
    }

    public void start() {
        String J1 = mo31394J1();
        boolean z = true;
        if (J1 != null) {
            String I1 = mo32559I1(J1);
            mo26843a1("File property is set to [" + I1 + C18829c.f46741g);
            if (this.f16923h1 && !mo32561L1()) {
                mo32566Q1(true);
                mo26839L("Setting \"Append\" property to true on account of \"Prudent\" mode");
            }
            if (!this.f16925j1) {
                try {
                    mo32563N1(I1);
                } catch (IOException e) {
                    mo26840O("openFile(" + I1 + "," + this.f16921f1 + ") failed", e);
                }
            } else {
                mo32581F1(new C6750m());
            }
            z = false;
        } else {
            mo26862z0("\"File\" property not set for appender named [" + this.f16938X0 + C18829c.f46741g);
        }
        if (!z) {
            super.start();
        }
    }
}
