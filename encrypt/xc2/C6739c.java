package xc2;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import wd2.C6663b;
import wd2.C6664c;
import y93.C18829c;

/* renamed from: xc2.c */
public class C6739c<E> extends C6753p<E> implements C6663b<E> {

    /* renamed from: i1 */
    public static final int f16834i1 = 256;

    /* renamed from: j1 */
    public static final int f16835j1 = -1;

    /* renamed from: c1 */
    public C6664c<E> f16836c1 = new C6664c<>();

    /* renamed from: d1 */
    public BlockingQueue<E> f16837d1;

    /* renamed from: e1 */
    public int f16838e1 = 256;

    /* renamed from: f1 */
    public int f16839f1 = 0;

    /* renamed from: g1 */
    public int f16840g1 = -1;

    /* renamed from: h1 */
    public C6739c<E>.C31134a f16841h1 = new C6740a();

    /* renamed from: xc2.c$a */
    public class C6740a extends Thread {
        public C6740a() {
        }

        public void run() {
            C6739c cVar = C6739c.this;
            C6664c<E> cVar2 = cVar.f16836c1;
            while (cVar.isStarted()) {
                try {
                    cVar2.mo32224a(cVar.f16837d1.take());
                } catch (InterruptedException unused) {
                }
            }
            C6739c.this.mo26843a1("Worker thread will flush remaining events before exiting.");
            for (E a : cVar.f16837d1) {
                cVar2.mo32224a(a);
            }
            cVar2.mo26251u();
        }
    }

    /* renamed from: A1 */
    public int mo32525A1() {
        return this.f16838e1;
    }

    /* renamed from: B1 */
    public int mo32526B1() {
        return this.f16837d1.remainingCapacity();
    }

    /* renamed from: C */
    public boolean mo26174C(C6737a<E> aVar) {
        return this.f16836c1.mo26174C(aVar);
    }

    /* renamed from: C1 */
    public boolean mo26160C1(E e) {
        return false;
    }

    /* renamed from: D1 */
    public final boolean mo32527D1() {
        return this.f16837d1.remainingCapacity() < this.f16840g1;
    }

    /* renamed from: E1 */
    public void mo26161E1(E e) {
    }

    /* renamed from: F1 */
    public final void mo32528F1(E e) {
        try {
            this.f16837d1.put(e);
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: G1 */
    public void mo32529G1(int i) {
        this.f16840g1 = i;
    }

    /* renamed from: H1 */
    public void mo32530H1(int i) {
        this.f16838e1 = i;
    }

    /* renamed from: I0 */
    public void mo26187I0(C6737a<E> aVar) {
        int i = this.f16839f1;
        if (i == 0) {
            this.f16839f1 = i + 1;
            mo26843a1("Attaching appender named [" + aVar.getName() + "] to AsyncAppender.");
            this.f16836c1.mo26187I0(aVar);
            return;
        }
        mo26839L("One and only one appender may be attached to AsyncAppender.");
        mo26839L("Ignoring additional appender named [" + aVar.getName() + C18829c.f46741g);
    }

    /* renamed from: d0 */
    public C6737a<E> mo26216d0(String str) {
        return this.f16836c1.mo26216d0(str);
    }

    /* renamed from: e0 */
    public boolean mo26218e0(String str) {
        return this.f16836c1.mo26218e0(str);
    }

    public void start() {
        if (this.f16839f1 == 0) {
            mo26862z0("No attached appenders found.");
        } else if (this.f16838e1 < 1) {
            mo26862z0("Invalid queue size [" + this.f16838e1 + C18829c.f46741g);
        } else {
            this.f16837d1 = new ArrayBlockingQueue(this.f16838e1);
            if (this.f16840g1 == -1) {
                this.f16840g1 = this.f16838e1 / 5;
            }
            mo26843a1("Setting discardingThreshold to " + this.f16840g1);
            this.f16841h1.setDaemon(true);
            C6739c<E>.C31134a aVar = this.f16841h1;
            aVar.setName("AsyncAppender-Worker-" + this.f16841h1.getName());
            super.start();
            this.f16841h1.start();
        }
    }

    public void stop() {
        if (isStarted()) {
            super.stop();
            this.f16841h1.interrupt();
            try {
                this.f16841h1.join(1000);
            } catch (InterruptedException e) {
                mo26840O("Failed to join worker thread", e);
            }
        }
    }

    /* renamed from: u */
    public void mo26251u() {
        this.f16836c1.mo26251u();
    }

    /* renamed from: u0 */
    public boolean mo26252u0(C6737a<E> aVar) {
        return this.f16836c1.mo26252u0(aVar);
    }

    /* renamed from: v1 */
    public Iterator<C6737a<E>> mo26255v1() {
        return this.f16836c1.mo26255v1();
    }

    /* renamed from: x1 */
    public void mo26470x1(E e) {
        if (!mo32527D1() || !mo26160C1(e)) {
            mo26161E1(e);
            mo32528F1(e);
        }
    }

    /* renamed from: y1 */
    public int mo32531y1() {
        return this.f16840g1;
    }

    /* renamed from: z1 */
    public int mo32532z1() {
        return this.f16837d1.size();
    }
}
