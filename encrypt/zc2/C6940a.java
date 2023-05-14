package zc2;

import p068ch.qos.logback.core.boolex.EvaluationException;
import wd2.C6666e;
import wd2.C6674m;

/* renamed from: zc2.a */
public interface C6940a<E> extends C6666e, C6674m {
    boolean evaluate(E e) throws NullPointerException, EvaluationException;

    String getName();

    void setName(String str);
}
