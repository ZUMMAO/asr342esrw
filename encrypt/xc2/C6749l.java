package xc2;

import java.util.HashSet;
import java.util.Set;
import wd2.C6674m;

/* renamed from: xc2.l */
public class C6749l {

    /* renamed from: a */
    public final Set<C6674m> f16931a = new HashSet();

    /* renamed from: a */
    public void mo32573a(C6674m mVar) {
        this.f16931a.add(mVar);
    }

    /* renamed from: b */
    public void mo32574b() {
        for (C6674m next : this.f16931a) {
            if (next.isStarted()) {
                next.stop();
            }
        }
        this.f16931a.clear();
    }
}
