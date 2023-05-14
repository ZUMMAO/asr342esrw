package wd2;

import bd2.C3193c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: wd2.k */
public final class C6672k<E> implements C6671j<E> {

    /* renamed from: k0 */
    public CopyOnWriteArrayList<C3193c<E>> f16575k0 = new CopyOnWriteArrayList<>();

    /* renamed from: G */
    public void mo32235G() {
        this.f16575k0.clear();
    }

    /* renamed from: M */
    public List<C3193c<E>> mo32236M() {
        return new ArrayList(this.f16575k0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wd2.C6673l mo32237R(E r4) {
        /*
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<bd2.c<E>> r0 = r3.f16575k0
            java.util.Iterator r2 = r0.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r2.next()
            bd2.c r0 = (bd2.C3193c) r0
            wd2.l r1 = r0.mo20670x1(r4)
            wd2.l r0 = wd2.C6673l.DENY
            if (r1 == r0) goto L_0x001e
            wd2.l r0 = wd2.C6673l.ACCEPT
            if (r1 != r0) goto L_0x0006
        L_0x001e:
            return r1
        L_0x001f:
            wd2.l r0 = wd2.C6673l.NEUTRAL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wd2.C6672k.mo32237R(java.lang.Object):wd2.l");
    }

    /* renamed from: e */
    public void mo32238e(C3193c<E> cVar) {
        this.f16575k0.add(cVar);
    }
}
