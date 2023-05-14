package wd2;

import er1.C32391a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: wd2.a */
public abstract class C6657a<C> implements C6665d<C> {

    /* renamed from: k */
    public static final boolean f16545k = true;

    /* renamed from: l */
    public static final long f16546l = 10000;

    /* renamed from: m */
    public static final long f16547m = 1000;

    /* renamed from: c */
    public int f16548c = Integer.MAX_VALUE;

    /* renamed from: d */
    public long f16549d = 1800000;

    /* renamed from: e */
    public LinkedHashMap<String, C6661d<C>> f16550e = new LinkedHashMap<>(32, 0.75f, true);

    /* renamed from: f */
    public LinkedHashMap<String, C6661d<C>> f16551f = new LinkedHashMap<>(16, 0.75f, true);

    /* renamed from: g */
    public long f16552g = 0;

    /* renamed from: h */
    public C6662e<C> f16553h = new C6658a();

    /* renamed from: i */
    public C6662e<C> f16554i = new C6659b();

    /* renamed from: j */
    public C6662e<C> f16555j = new C6660c();

    /* renamed from: wd2.a$a */
    public class C6658a implements C6662e<C> {
        public C6658a() {
        }

        /* renamed from: a */
        public boolean mo32219a(C6661d<C> dVar, long j) {
            return C6657a.this.f16550e.size() > C6657a.this.f16548c;
        }
    }

    /* renamed from: wd2.a$b */
    public class C6659b implements C6662e<C> {
        public C6659b() {
        }

        /* renamed from: a */
        public boolean mo32219a(C6661d<C> dVar, long j) {
            return C6657a.this.mo32212q(dVar, j);
        }
    }

    /* renamed from: wd2.a$c */
    public class C6660c implements C6662e<C> {
        public C6660c() {
        }

        /* renamed from: a */
        public boolean mo32219a(C6661d<C> dVar, long j) {
            return C6657a.this.mo32211p(dVar, j);
        }
    }

    /* renamed from: wd2.a$d */
    public static class C6661d<C> {

        /* renamed from: a */
        public String f16559a;

        /* renamed from: b */
        public C f16560b;

        /* renamed from: c */
        public long f16561c;

        public C6661d(String str, C c, long j) {
            this.f16559a = str;
            this.f16560b = c;
            this.f16561c = j;
        }

        /* renamed from: a */
        public void mo32220a(long j) {
            this.f16561c = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C6661d dVar = (C6661d) obj;
            String str = this.f16559a;
            if (str == null) {
                if (dVar.f16559a != null) {
                    return false;
                }
            } else if (!str.equals(dVar.f16559a)) {
                return false;
            }
            C c = this.f16560b;
            C c2 = dVar.f16560b;
            if (c == null) {
                if (c2 != null) {
                    return false;
                }
            } else if (!c.equals(c2)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f16559a.hashCode();
        }

        public String toString() {
            return "(" + this.f16559a + C32391a.f78631y + this.f16560b + ")";
        }
    }

    /* renamed from: wd2.a$e */
    public interface C6662e<C> {
        /* renamed from: a */
        boolean mo32219a(C6661d<C> dVar, long j);
    }

    /* renamed from: a */
    public void mo32200a(String str) {
        C6661d dVar = (C6661d) this.f16550e.remove(str);
        if (dVar != null) {
            this.f16551f.put(str, dVar);
        }
    }

    /* renamed from: b */
    public Collection<C> mo32201b() {
        ArrayList arrayList = new ArrayList();
        for (C6661d<C> dVar : this.f16550e.values()) {
            arrayList.add(dVar.f16560b);
        }
        for (C6661d<C> dVar2 : this.f16551f.values()) {
            arrayList.add(dVar2.f16560b);
        }
        return arrayList;
    }

    /* renamed from: c */
    public Set<String> mo32202c() {
        HashSet hashSet = new HashSet(this.f16550e.keySet());
        hashSet.addAll(this.f16551f.keySet());
        return hashSet;
    }

    /* renamed from: d */
    public synchronized C mo32203d(String str) {
        C6661d l = mo32208l(str);
        if (l == null) {
            return null;
        }
        return l.f16560b;
    }

    /* renamed from: e */
    public int mo32204e() {
        return this.f16550e.size() + this.f16551f.size();
    }

    /* renamed from: f */
    public synchronized C mo32205f(String str, long j) {
        C6661d l;
        l = mo32208l(str);
        if (l == null) {
            l = new C6661d(str, mo32009j(str), j);
            this.f16550e.put(str, l);
        } else {
            l.mo32220a(j);
        }
        return l.f16560b;
    }

    /* renamed from: g */
    public synchronized void mo32206g(long j) {
        if (!mo32213r(j)) {
            mo32214t();
            mo32216v(j);
            mo32215u(j);
        }
    }

    /* renamed from: j */
    public abstract C mo32009j(String str);

    /* renamed from: k */
    public final void mo32207k(LinkedHashMap<String, C6661d<C>> linkedHashMap, long j, C6662e<C> eVar) {
        Iterator<Map.Entry<String, C6661d<C>>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            C6661d dVar = (C6661d) it.next().getValue();
            if (eVar.mo32219a(dVar, j)) {
                it.remove();
                mo32011s(dVar.f16560b);
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    public final C6661d<C> mo32208l(String str) {
        C6661d<C> dVar = this.f16550e.get(str);
        return dVar != null ? dVar : this.f16551f.get(str);
    }

    /* renamed from: m */
    public int mo32209m() {
        return this.f16548c;
    }

    /* renamed from: n */
    public long mo32210n() {
        return this.f16549d;
    }

    /* renamed from: o */
    public abstract boolean mo32010o(C c);

    /* renamed from: p */
    public final boolean mo32211p(C6661d dVar, long j) {
        return dVar.f16561c + 10000 < j;
    }

    /* renamed from: q */
    public final boolean mo32212q(C6661d<C> dVar, long j) {
        return mo32010o(dVar.f16560b) || dVar.f16561c + this.f16549d < j;
    }

    /* renamed from: r */
    public final boolean mo32213r(long j) {
        if (this.f16552g + 1000 > j) {
            return true;
        }
        this.f16552g = j;
        return false;
    }

    /* renamed from: s */
    public abstract void mo32011s(C c);

    /* renamed from: t */
    public final void mo32214t() {
        mo32207k(this.f16550e, 0, this.f16553h);
    }

    /* renamed from: u */
    public final void mo32215u(long j) {
        mo32207k(this.f16551f, j, this.f16555j);
    }

    /* renamed from: v */
    public final void mo32216v(long j) {
        mo32207k(this.f16550e, j, this.f16554i);
    }

    /* renamed from: w */
    public void mo32217w(int i) {
        this.f16548c = i;
    }

    /* renamed from: x */
    public void mo32218x(long j) {
        this.f16549d = j;
    }
}
