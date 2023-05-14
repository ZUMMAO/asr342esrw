package bd2;

import p068ch.qos.logback.core.boolex.EvaluationException;
import wd2.C6673l;
import zc2.C6940a;

/* renamed from: bd2.b */
public class C3192b<E> extends C3191a<E> {

    /* renamed from: Z0 */
    public C6940a<E> f6814Z0;

    /* renamed from: C1 */
    public C6940a<E> mo20668C1() {
        return this.f6814Z0;
    }

    /* renamed from: D1 */
    public void mo20669D1(C6940a<E> aVar) {
        this.f6814Z0 = aVar;
    }

    public void start() {
        if (this.f6814Z0 != null) {
            super.start();
            return;
        }
        mo26862z0("No evaluator set for filter " + getName());
    }

    /* renamed from: x1 */
    public C6673l mo20670x1(E e) {
        if (!isStarted() || !this.f6814Z0.isStarted()) {
            return C6673l.NEUTRAL;
        }
        try {
            return this.f6814Z0.evaluate(e) ? this.f6812X0 : this.f6813Y0;
        } catch (EvaluationException e2) {
            mo26840O("Evaluator " + this.f6814Z0.getName() + " threw an exception", e2);
            return C6673l.NEUTRAL;
        }
    }
}
