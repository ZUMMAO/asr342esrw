package xc2;

import cd2.C3852a;
import java.util.ArrayList;
import java.util.List;
import wd2.C6675n;
import xd2.C6760g;
import xd2.C6762i;
import xd2.C6764k;
import xd2.C6766m;

/* renamed from: xc2.d */
public class C6741d implements C6764k {

    /* renamed from: h */
    public static final int f16843h = 150;

    /* renamed from: i */
    public static final int f16844i = 150;

    /* renamed from: a */
    public int f16845a = 0;

    /* renamed from: b */
    public final List<C6760g> f16846b = new ArrayList();

    /* renamed from: c */
    public final C3852a<C6760g> f16847c = new C3852a<>(150);

    /* renamed from: d */
    public final C6675n f16848d = new C6675n();

    /* renamed from: e */
    public int f16849e = 0;

    /* renamed from: f */
    public final List<C6762i> f16850f = new ArrayList();

    /* renamed from: g */
    public final C6675n f16851g = new C6675n();

    /* renamed from: a */
    public void mo32534a(C6760g gVar) {
        mo32541g(gVar);
        this.f16845a++;
        if (gVar.mo32593c() > this.f16849e) {
            this.f16849e = gVar.mo32593c();
        }
        synchronized (this.f16848d) {
            if (this.f16846b.size() < 150) {
                this.f16846b.add(gVar);
            } else {
                this.f16847c.mo23529a(gVar);
            }
        }
    }

    /* renamed from: b */
    public void mo32535b(C6762i iVar) {
        synchronized (this.f16851g) {
            this.f16850f.add(iVar);
        }
    }

    /* renamed from: c */
    public List<C6762i> mo32536c() {
        ArrayList arrayList;
        synchronized (this.f16851g) {
            arrayList = new ArrayList(this.f16850f);
        }
        return arrayList;
    }

    public void clear() {
        synchronized (this.f16848d) {
            this.f16845a = 0;
            this.f16846b.clear();
            this.f16847c.mo23531c();
        }
    }

    /* renamed from: d */
    public List<C6760g> mo32538d() {
        ArrayList arrayList;
        synchronized (this.f16848d) {
            arrayList = new ArrayList(this.f16846b);
            arrayList.addAll(this.f16847c.mo23530b());
        }
        return arrayList;
    }

    /* renamed from: e */
    public void mo32539e(C6762i iVar) {
        synchronized (this.f16851g) {
            this.f16850f.remove(iVar);
        }
    }

    /* renamed from: f */
    public boolean mo32540f(C6762i iVar, Object obj) {
        for (C6762i next : mo32536c()) {
            if (next.getClass().isInstance(iVar)) {
                mo32534a(new C6766m("A previous listener of type [" + next.getClass() + "] has been already registered. Skipping double registration.", obj));
                return false;
            }
        }
        mo32535b(iVar);
        return true;
    }

    /* renamed from: g */
    public final void mo32541g(C6760g gVar) {
        synchronized (this.f16851g) {
            for (C6762i n0 : this.f16850f) {
                n0.mo32585n0(gVar);
            }
        }
    }

    public int getCount() {
        return this.f16845a;
    }

    /* renamed from: h */
    public int mo32543h() {
        return this.f16849e;
    }
}
