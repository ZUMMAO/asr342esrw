package wd2;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xc2.C6737a;

/* renamed from: wd2.c */
public class C6664c<E> implements C6663b<E> {

    /* renamed from: K0 */
    public static final long f16562K0 = System.currentTimeMillis();

    /* renamed from: k0 */
    public final CopyOnWriteArrayList<C6737a<E>> f16563k0 = new CopyOnWriteArrayList<>();

    /* renamed from: C */
    public boolean mo26174C(C6737a<E> aVar) {
        if (aVar == null) {
            return false;
        }
        Iterator<C6737a<E>> it = this.f16563k0.iterator();
        while (it.hasNext()) {
            if (it.next() == aVar) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I0 */
    public void mo26187I0(C6737a<E> aVar) {
        if (aVar != null) {
            this.f16563k0.addIfAbsent(aVar);
            return;
        }
        throw new IllegalArgumentException("Null argument disallowed");
    }

    /* renamed from: a */
    public int mo32224a(E e) {
        Iterator<C6737a<E>> it = this.f16563k0.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next().mo32521L0(e);
            i++;
        }
        return i;
    }

    /* renamed from: d0 */
    public C6737a<E> mo26216d0(String str) {
        if (str == null) {
            return null;
        }
        Iterator<C6737a<E>> it = this.f16563k0.iterator();
        while (it.hasNext()) {
            C6737a<E> next = it.next();
            if (str.equals(next.getName())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e0 */
    public boolean mo26218e0(String str) {
        if (str == null) {
            return false;
        }
        Iterator<C6737a<E>> it = this.f16563k0.iterator();
        while (it.hasNext()) {
            C6737a next = it.next();
            if (str.equals(next.getName())) {
                return this.f16563k0.remove(next);
            }
        }
        return false;
    }

    /* renamed from: u */
    public void mo26251u() {
        Iterator<C6737a<E>> it = this.f16563k0.iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
        this.f16563k0.clear();
    }

    /* renamed from: u0 */
    public boolean mo26252u0(C6737a<E> aVar) {
        if (aVar == null) {
            return false;
        }
        return this.f16563k0.remove(aVar);
    }

    /* renamed from: v1 */
    public Iterator<C6737a<E>> mo26255v1() {
        return this.f16563k0.iterator();
    }
}
