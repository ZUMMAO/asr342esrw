package wd2;

import cd2.C3852a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wd2.h */
public class C6669h<E> extends C6657a<C3852a<E>> {

    /* renamed from: o */
    public static final int f16572o = 64;

    /* renamed from: p */
    public static final int f16573p = 256;

    /* renamed from: n */
    public int f16574n = 256;

    public C6669h() {
        mo32217w(64);
    }

    /* renamed from: A */
    public boolean mo32010o(C3852a<E> aVar) {
        return false;
    }

    /* renamed from: B */
    public List<String> mo32229B() {
        return new ArrayList(this.f16551f.keySet());
    }

    /* renamed from: C */
    public List<String> mo32230C() {
        return new ArrayList(this.f16550e.keySet());
    }

    /* renamed from: D */
    public void mo32011s(C3852a<E> aVar) {
        aVar.mo23531c();
    }

    /* renamed from: E */
    public void mo32232E(int i) {
        this.f16574n = i;
    }

    /* renamed from: y */
    public C3852a<E> mo32009j(String str) {
        return new C3852a<>(this.f16574n);
    }

    /* renamed from: z */
    public int mo32234z() {
        return this.f16574n;
    }
}
