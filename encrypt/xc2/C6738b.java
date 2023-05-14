package xc2;

import bd2.C3193c;
import java.util.List;
import wd2.C6667f;
import wd2.C6672k;
import wd2.C6673l;
import y93.C18829c;

/* renamed from: xc2.b */
public abstract class C6738b<E> extends C6667f implements C6737a<E> {

    /* renamed from: b1 */
    public static final int f16827b1 = 5;

    /* renamed from: V0 */
    public boolean f16828V0 = false;

    /* renamed from: W0 */
    public boolean f16829W0 = false;

    /* renamed from: X0 */
    public String f16830X0;

    /* renamed from: Y0 */
    public C6672k<E> f16831Y0 = new C6672k<>();

    /* renamed from: Z0 */
    public int f16832Z0 = 0;

    /* renamed from: a1 */
    public int f16833a1 = 0;

    /* renamed from: G */
    public void mo32235G() {
        this.f16831Y0.mo32235G();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0071=Splitter:B:31:0x0071, B:13:0x0038=Splitter:B:13:0x0038} */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo32521L0(E r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f16829W0     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            r4 = 5
            r0 = 1
            r3 = 0
            r5.f16829W0 = r0     // Catch:{ Exception -> 0x004d }
            boolean r0 = r5.f16828V0     // Catch:{ Exception -> 0x004d }
            if (r0 != 0) goto L_0x003c
            int r1 = r5.f16832Z0     // Catch:{ Exception -> 0x004d }
            int r0 = r1 + 1
            r5.f16832Z0 = r0     // Catch:{ Exception -> 0x004d }
            if (r1 >= r4) goto L_0x0038
            xd2.m r2 = new xd2.m     // Catch:{ Exception -> 0x004d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
            r1.<init>()     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = "Attempted to append to non started appender ["
            r1.append(r0)     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = r5.f16830X0     // Catch:{ Exception -> 0x004d }
            r1.append(r0)     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = "]."
            r1.append(r0)     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x004d }
            r2.<init>(r0, r5)     // Catch:{ Exception -> 0x004d }
            r5.mo26841O0(r2)     // Catch:{ Exception -> 0x004d }
        L_0x0038:
            r5.f16829W0 = r3     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return
        L_0x003c:
            wd2.l r1 = r5.mo32237R(r6)     // Catch:{ Exception -> 0x004d }
            wd2.l r0 = wd2.C6673l.DENY     // Catch:{ Exception -> 0x004d }
            if (r1 != r0) goto L_0x0045
            goto L_0x0049
        L_0x0045:
            r5.mo23538x1(r6)     // Catch:{ Exception -> 0x004d }
            goto L_0x0071
        L_0x0049:
            r5.f16829W0 = r3     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return
        L_0x004d:
            r2 = move-exception
            int r1 = r5.f16833a1     // Catch:{ all -> 0x0075 }
            int r0 = r1 + 1
            r5.f16833a1 = r0     // Catch:{ all -> 0x0075 }
            if (r1 >= r4) goto L_0x0071
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "Appender ["
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r5.f16830X0     // Catch:{ all -> 0x0075 }
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "] failed to append."
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0075 }
            r5.mo26840O(r0, r2)     // Catch:{ all -> 0x0075 }
        L_0x0071:
            r5.f16829W0 = r3     // Catch:{ all -> 0x0079 }
            monitor-exit(r5)
            return
        L_0x0075:
            r0 = move-exception
            r5.f16829W0 = r3     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.C6738b.mo32521L0(java.lang.Object):void");
    }

    /* renamed from: M */
    public List<C3193c<E>> mo32236M() {
        return this.f16831Y0.mo32236M();
    }

    /* renamed from: R */
    public C6673l mo32237R(E e) {
        return this.f16831Y0.mo32237R(e);
    }

    /* renamed from: e */
    public void mo32238e(C3193c<E> cVar) {
        this.f16831Y0.mo32238e(cVar);
    }

    public String getName() {
        return this.f16830X0;
    }

    public boolean isStarted() {
        return this.f16828V0;
    }

    public void setName(String str) {
        this.f16830X0 = str;
    }

    public void start() {
        this.f16828V0 = true;
    }

    public void stop() {
        this.f16828V0 = false;
    }

    public String toString() {
        return getClass().getName() + C18829c.f46742h + this.f16830X0 + C18829c.f46741g;
    }

    /* renamed from: x1 */
    public abstract void mo23538x1(E e);
}
