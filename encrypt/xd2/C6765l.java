package xd2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import xc2.C6743f;
import xc2.C6745h;

/* renamed from: xd2.l */
public class C6765l {

    /* renamed from: a */
    public C6764k f16956a;

    public C6765l(C6743f fVar) {
        this.f16956a = fVar.mo32549M0();
    }

    public C6765l(C6764k kVar) {
        this.f16956a = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r0.mo32536c();
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m22952i(xc2.C6743f r1) {
        /*
            xd2.k r0 = r1.mo32549M0()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.List r0 = r0.mo32536c()
            if (r0 == 0) goto L_0x0014
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            return r1
        L_0x0015:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xd2.C6765l.m22952i(xc2.f):boolean");
    }

    /* renamed from: j */
    public static List<C6760g> m22953j(List<C6760g> list, long j) {
        ArrayList arrayList = new ArrayList();
        for (C6760g next : list) {
            if (next.mo32592b().longValue() >= j) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo32605a(Object obj, String str, Throwable th) {
        mo32607c(new C6754a(str, obj, th));
    }

    /* renamed from: b */
    public void mo32606b(Object obj, String str) {
        mo32607c(new C6755b(str, obj));
    }

    /* renamed from: c */
    public void mo32607c(C6760g gVar) {
        C6764k kVar = this.f16956a;
        if (kVar != null) {
            kVar.mo32534a(gVar);
        }
    }

    /* renamed from: d */
    public void mo32608d(Object obj, String str) {
        mo32607c(new C6766m(str, obj));
    }

    /* renamed from: e */
    public boolean mo32609e(Class<?> cls) {
        for (C6760g e : this.f16956a.mo32538d()) {
            Throwable e2 = e.mo32595e();
            if (e2 != null && e2.getClass().getName().equals(cls.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo32610f(int i, String str) {
        return mo32611g(0, i, str);
    }

    /* renamed from: g */
    public boolean mo32611g(long j, int i, String str) {
        List<C6760g> j2 = m22953j(this.f16956a.mo32538d(), j);
        Pattern compile = Pattern.compile(str);
        for (C6760g next : j2) {
            if (i == next.mo32593c() && compile.matcher(next.getMessage()).lookingAt()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo32612h(String str) {
        Pattern compile = Pattern.compile(str);
        for (C6760g message : this.f16956a.mo32538d()) {
            if (compile.matcher(message.getMessage()).lookingAt()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public int mo32613k(long j) {
        int i = 0;
        for (C6760g next : m22953j(this.f16956a.mo32538d(), j)) {
            if (next.mo32593c() > i) {
                i = next.mo32593c();
            }
        }
        return i;
    }

    /* renamed from: l */
    public boolean mo32614l(long j) {
        return mo32611g(j, 2, C6745h.f16875N);
    }

    /* renamed from: m */
    public boolean mo32615m(long j) {
        return 2 > mo32613k(j);
    }

    /* renamed from: n */
    public int mo32616n(String str) {
        Pattern compile = Pattern.compile(str);
        int i = 0;
        for (C6760g message : this.f16956a.mo32538d()) {
            if (compile.matcher(message.getMessage()).lookingAt()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public boolean mo32617o(long j) {
        return !mo32614l(j);
    }

    /* renamed from: p */
    public long mo32618p() {
        List<C6760g> d = this.f16956a.mo32538d();
        if (d == null) {
            return -1;
        }
        for (int size = d.size() - 1; size >= 0; size--) {
            C6760g gVar = d.get(size);
            if (C6745h.f16895d0.equals(gVar.getMessage())) {
                return gVar.mo32592b().longValue();
            }
        }
        return -1;
    }
}
