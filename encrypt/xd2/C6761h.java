package xd2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: xd2.h */
public abstract class C6761h implements C6760g {

    /* renamed from: j */
    public static final List<C6760g> f16948j = new ArrayList(0);

    /* renamed from: d */
    public int f16949d;

    /* renamed from: e */
    public final String f16950e;

    /* renamed from: f */
    public final Object f16951f;

    /* renamed from: g */
    public List<C6760g> f16952g;

    /* renamed from: h */
    public Throwable f16953h;

    /* renamed from: i */
    public long f16954i;

    public C6761h(int i, String str, Object obj) {
        this(i, str, obj, (Throwable) null);
    }

    public C6761h(int i, String str, Object obj, Throwable th) {
        this.f16949d = i;
        this.f16950e = str;
        this.f16951f = obj;
        this.f16953h = th;
        this.f16954i = System.currentTimeMillis();
    }

    /* renamed from: a */
    public synchronized void mo32591a(C6760g gVar) {
        if (gVar != null) {
            if (this.f16952g == null) {
                this.f16952g = new ArrayList();
            }
            this.f16952g.add(gVar);
        } else {
            throw new NullPointerException("Null values are not valid Status.");
        }
    }

    /* renamed from: b */
    public Long mo32592b() {
        return Long.valueOf(this.f16954i);
    }

    /* renamed from: c */
    public int mo32593c() {
        return this.f16949d;
    }

    /* renamed from: d */
    public synchronized boolean mo32594d(C6760g gVar) {
        List<C6760g> list = this.f16952g;
        if (list == null) {
            return false;
        }
        return list.remove(gVar);
    }

    /* renamed from: e */
    public Throwable mo32595e() {
        return this.f16953h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6761h hVar = (C6761h) obj;
        if (this.f16949d != hVar.f16949d) {
            return false;
        }
        String str = this.f16950e;
        String str2 = hVar.f16950e;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public synchronized int mo32596f() {
        int i;
        i = this.f16949d;
        Iterator<C6760g> it = iterator();
        while (it.hasNext()) {
            int f = it.next().mo32596f();
            if (f > i) {
                i = f;
            }
        }
        return i;
    }

    public String getMessage() {
        return this.f16950e;
    }

    public Object getOrigin() {
        return this.f16951f;
    }

    public synchronized boolean hasChildren() {
        List<C6760g> list;
        list = this.f16952g;
        return list != null && list.size() > 0;
    }

    public int hashCode() {
        int i = (this.f16949d + 31) * 31;
        String str = this.f16950e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public synchronized Iterator<C6760g> iterator() {
        List<C6760g> list = this.f16952g;
        if (list != null) {
            return list.iterator();
        }
        return f16948j.iterator();
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        int f = mo32596f();
        if (f != 0) {
            if (f == 1) {
                str = "WARN";
            } else if (f == 2) {
                str = "ERROR";
            }
            stringBuffer.append(str);
        } else {
            str = "INFO";
            stringBuffer.append(str);
        }
        if (this.f16951f != null) {
            stringBuffer.append(" in ");
            stringBuffer.append(this.f16951f);
            stringBuffer.append(" -");
        }
        stringBuffer.append(" ");
        stringBuffer.append(this.f16950e);
        if (this.f16953h != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.f16953h);
        }
        return stringBuffer.toString();
    }
}
