package uk.gov.ros.lr.deed.structured.interpreter.lexers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import uk.gov.ros.lr.deed.structured.model.IEntity;

import java.util.Stack;

interface IParser {
    //------------------------------------------
    default String txt(ParserRuleContext ctx) {
        if(!(ctx==null || ctx.getText() == null)) {

            Interval i = Interval.of(ctx.start.getStartIndex(), ctx.stop.getStopIndex());
            String result =  ctx.start.getInputStream().getText(i);
            return  result;

        }
        else return "";
    }

    //-----------------------------------------
    Stack<IEntity> getStack();


    //------------------------------------------
    default <T extends IEntity> T stackPeek(Class<T> clazz) {
        return (T) getStack().peek();
    }
    default  IEntity stackPeek() { return getStack().peek(); }

    //------------------------------------------
    default <T extends IEntity> T stackPop(Class<T> clazz) {
        return (T) getStack().pop();
    }

    default IEntity stackPop() {
        return  getStack().pop();
    }

    //------------------------------------------
    default void stackPush(IEntity e) {
        getStack().push(e);
    }

    //----------------------------------------------------
    default <T extends IEntity> boolean stackTopIs(Class<T> clazz) {
        if(getStack().size() > 0) {
            return getStack().peek().getClass().equals(clazz);
        }
        return false;
    }

    //----------------------------------------------------
    default <T extends IEntity> boolean stackTopIsSubClassOf(Class<T> clazz) {
        if(getStack().size() > 0) {
            return clazz.isAssignableFrom(getStack().peek().getClass());
        }
        return false;
    }
}
