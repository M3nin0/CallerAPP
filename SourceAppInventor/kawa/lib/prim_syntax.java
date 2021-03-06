package kawa.lib;

import gnu.expr.Expression;
import gnu.expr.IfExp;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.expr.SetExp;
import gnu.expr.Special;
import gnu.kawa.lispexpr.LispLanguage;
import gnu.kawa.xml.XDataType;
import gnu.lists.Consumer;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.mapping.CallContext;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Values;
import gnu.math.IntNum;
import kawa.lang.Macro;
import kawa.lang.Quote;
import kawa.lang.SyntaxForms;
import kawa.lang.SyntaxPattern;
import kawa.lang.SyntaxRule;
import kawa.lang.SyntaxRules;
import kawa.lang.SyntaxTemplate;
import kawa.lang.TemplateScope;
import kawa.standard.syntax_case;
import kawa.standard.syntax_error;
import kawa.standard.try_catch;

/* compiled from: prim_syntax.scm */
public class prim_syntax extends ModuleBody {
    public static final prim_syntax $instance;
    static final SimpleSymbol Lit0;
    static final SyntaxRules Lit1;
    static final SyntaxRules Lit10;
    static final SimpleSymbol Lit11;
    static final SyntaxRules Lit12;
    static final SimpleSymbol Lit13;
    static final SyntaxPattern Lit14;
    static final SyntaxTemplate Lit15;
    static final SyntaxTemplate Lit16;
    static final SyntaxPattern Lit17;
    static final SyntaxTemplate Lit18;
    static final SyntaxTemplate Lit19;
    static final SimpleSymbol Lit2;
    static final SyntaxTemplate Lit20;
    static final SyntaxPattern Lit21;
    static final SyntaxTemplate Lit22;
    static final SyntaxPattern Lit23;
    static final SyntaxTemplate Lit24;
    static final SimpleSymbol Lit25;
    static final SyntaxPattern Lit26;
    static final SyntaxTemplate Lit27;
    static final SyntaxTemplate Lit28;
    static final SimpleSymbol Lit29;
    static final SyntaxRules Lit3;
    static final SyntaxPattern Lit30;
    static final SyntaxTemplate Lit31;
    static final SyntaxTemplate Lit32;
    static final SyntaxTemplate Lit33;
    static final SyntaxPattern Lit34;
    static final SyntaxPattern Lit35;
    static final SyntaxTemplate Lit36;
    static final SyntaxTemplate Lit37;
    static final SyntaxTemplate Lit38;
    static final SyntaxPattern Lit39;
    static final SimpleSymbol Lit4;
    static final SyntaxTemplate Lit40;
    static final SyntaxTemplate Lit41;
    static final SyntaxTemplate Lit42;
    static final SyntaxPattern Lit43;
    static final SyntaxPattern Lit44;
    static final SimpleSymbol Lit45;
    static final SimpleSymbol Lit46;
    static final SimpleSymbol Lit47;
    static final SimpleSymbol Lit48;
    static final SimpleSymbol Lit49;
    static final SyntaxRules Lit5;
    static final SimpleSymbol Lit50;
    static final IntNum Lit51;
    static final IntNum Lit52;
    static final IntNum Lit53;
    static final IntNum Lit54;
    static final IntNum Lit55;
    static final IntNum Lit56;
    static final SimpleSymbol Lit57;
    static final SimpleSymbol Lit58;
    static final SimpleSymbol Lit6;
    static final SyntaxRules Lit7;
    static final SimpleSymbol Lit8;
    static final SimpleSymbol Lit9;
    public static final Macro define;
    public static final Macro define$Mnconstant;
    public static final Macro define$Mnprivate;
    public static final Macro define$Mnsyntax;
    public static final Macro f96if;
    public static final Macro letrec;
    public static final Macro syntax$Mn$Grexpression;
    public static final Macro syntax$Mnbody$Mn$Grexpression;
    public static final ModuleMethod syntax$Mnerror;
    public static final Macro try$Mncatch;

    /* compiled from: prim_syntax.scm */
    public class frame extends ModuleBody {
        Object[] $unnamed$0;
        Object out$Mnbindings;
        Object out$Mninits;

        public Object lambda4processBinding(Object b) {
            Object[] allocVars = SyntaxPattern.allocVars(8, this.$unnamed$0);
            if (prim_syntax.Lit34.match(b, allocVars, 0)) {
                return Values.empty;
            }
            if (prim_syntax.Lit35.match(b, allocVars, 0)) {
                this.out$Mnbindings = new Pair(prim_syntax.Lit36.execute(allocVars, TemplateScope.make()), this.out$Mnbindings);
                this.out$Mninits = new Pair(prim_syntax.Lit37.execute(allocVars, TemplateScope.make()), this.out$Mninits);
                return lambda4processBinding(prim_syntax.Lit38.execute(allocVars, TemplateScope.make()));
            } else if (prim_syntax.Lit39.match(b, allocVars, 0)) {
                this.out$Mnbindings = new Pair(prim_syntax.Lit40.execute(allocVars, TemplateScope.make()), this.out$Mnbindings);
                this.out$Mninits = new Pair(prim_syntax.Lit41.execute(allocVars, TemplateScope.make()), this.out$Mninits);
                return lambda4processBinding(prim_syntax.Lit42.execute(allocVars, TemplateScope.make()));
            } else if (prim_syntax.Lit43.match(b, allocVars, 0)) {
                r0 = "missing initializion in letrec";
                if (r0 instanceof Object[]) {
                    allocVars = (Object[]) r0;
                } else {
                    allocVars = new Object[]{r0};
                }
                return prim_syntax.syntaxError(b, allocVars);
            } else if (!prim_syntax.Lit44.match(b, allocVars, 0)) {
                return syntax_case.error("syntax-case", b);
            } else {
                r0 = "invalid bindings syntax in letrec";
                if (r0 instanceof Object[]) {
                    allocVars = (Object[]) r0;
                } else {
                    allocVars = new Object[]{r0};
                }
                return prim_syntax.syntaxError(b, allocVars);
            }
        }
    }

    static {
        Lit58 = (SimpleSymbol) new SimpleSymbol("lambda").readResolve();
        Lit57 = (SimpleSymbol) new SimpleSymbol("%define-syntax").readResolve();
        Lit56 = IntNum.make(0);
        Lit55 = IntNum.make(1);
        Lit54 = IntNum.make(4);
        Lit53 = IntNum.make(5);
        Lit52 = IntNum.make(8);
        Lit51 = IntNum.make(9);
        Lit50 = (SimpleSymbol) new SimpleSymbol("%define").readResolve();
        Lit49 = (SimpleSymbol) new SimpleSymbol("::").readResolve();
        Lit48 = (SimpleSymbol) new SimpleSymbol(LispLanguage.quasiquote_sym).readResolve();
        Lit47 = (SimpleSymbol) new SimpleSymbol("kawa.lang.SyntaxForms").readResolve();
        Lit46 = (SimpleSymbol) new SimpleSymbol("$lookup$").readResolve();
        Lit45 = (SimpleSymbol) new SimpleSymbol("set!").readResolve();
        Lit44 = new SyntaxPattern("\u001b", new Object[0], 4);
        Lit43 = new SyntaxPattern("\u001c\f\u001f\b#", new Object[0], 5);
        Lit42 = new SyntaxTemplate("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", ":", new Object[0], 0);
        Lit41 = new SyntaxTemplate("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", "\u0011\u0018\u0004\t\u001b\b3", new Object[]{Lit45}, 0);
        Lit40 = new SyntaxTemplate("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", "\t\u001b\t#\t+\u0018\u0004", new Object[]{PairWithPosition.make(Special.undefined, LList.Empty, "/u2/home/jis/ai2-kawa/kawa/lib/prim_syntax.scm", 471102)}, 0);
        Lit39 = new SyntaxPattern("L\f\u001f\f'\f/\f7\b;", new Object[0], 8);
        Lit38 = new SyntaxTemplate("\u0001\u0001\u0000\u0001\u0001\u0000", "*", new Object[0], 0);
        Lit37 = new SyntaxTemplate("\u0001\u0001\u0000\u0001\u0001\u0000", "\u0011\u0018\u0004\t\u001b\b#", new Object[]{Lit45}, 0);
        Lit36 = new SyntaxTemplate("\u0001\u0001\u0000\u0001\u0001\u0000", "\t\u001b\u0018\u0004", new Object[]{PairWithPosition.make(Special.undefined, LList.Empty, "/u2/home/jis/ai2-kawa/kawa/lib/prim_syntax.scm", 450594)}, 0);
        Lit35 = new SyntaxPattern(",\f\u001f\f'\b+", new Object[0], 6);
        Lit34 = new SyntaxPattern("\b", new Object[0], 3);
        Lit33 = new SyntaxTemplate("\u0001\u0001\u0000", "\u0012", new Object[0], 0);
        Lit32 = new SyntaxTemplate("\u0001\u0001\u0000", "\u0018\u0004", new Object[]{PairWithPosition.make((SimpleSymbol) new SimpleSymbol("%let").readResolve(), LList.Empty, "/u2/home/jis/ai2-kawa/kawa/lib/prim_syntax.scm", 512011)}, 0);
        Lit31 = new SyntaxTemplate("\u0001\u0001\u0000", "\u000b", new Object[0], 0);
        Lit30 = new SyntaxPattern("\f\u0007\f\u000f\u0013", new Object[0], 3);
        Lit29 = (SimpleSymbol) new SimpleSymbol("letrec").readResolve();
        Lit28 = new SyntaxTemplate("\u0001\u0001\u0003\u0003\u0002", "(\b\u0015A\b\t\u0013\u0011\u0018\u0004\b\u001b\"", new Object[]{Lit49}, 1);
        Lit27 = new SyntaxTemplate("\u0001\u0001\u0003\u0003\u0002", "\u000b", new Object[0], 0);
        Lit26 = new SyntaxPattern("\f\u0007\f\u000f-\f\u0017\f\u001f#\u0010\u0018\b", new Object[0], 5);
        Lit25 = (SimpleSymbol) new SimpleSymbol("try-catch").readResolve();
        Lit24 = new SyntaxTemplate("\u0001\u0000", "\n", new Object[0], 0);
        Lit23 = new SyntaxPattern("\f\u0007\u000b", new Object[0], 2);
        Lit22 = new SyntaxTemplate("\u0001\u0001\u0001\u0001\u0001\u0000", "#", new Object[0], 0);
        Lit21 = new SyntaxPattern("\f\u0007\f\u000f\f\u0017\f\u001f\f'+", new Object[0], 6);
        Lit20 = new SyntaxTemplate("\u0001\u0001\u0001\u0001", "\u001b", new Object[0], 0);
        Lit19 = new SyntaxTemplate("\u0001\u0001\u0001\u0001", "\u0013", new Object[0], 0);
        Lit18 = new SyntaxTemplate("\u0001\u0001\u0001\u0001", "\u000b", new Object[0], 0);
        Lit17 = new SyntaxPattern("\f\u0007\f\u000f\f\u0017\f\u001f\b", new Object[0], 4);
        Lit16 = new SyntaxTemplate("\u0001\u0001\u0001", "\u0013", new Object[0], 0);
        Lit15 = new SyntaxTemplate("\u0001\u0001\u0001", "\u000b", new Object[0], 0);
        Lit14 = new SyntaxPattern("\f\u0007\f\u000f\f\u0017\b", new Object[0], 3);
        Lit13 = (SimpleSymbol) new SimpleSymbol("if").readResolve();
        Object[] objArr = new Object[1];
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol("syntax-body->expression").readResolve();
        Lit11 = simpleSymbol;
        objArr[0] = simpleSymbol;
        SyntaxRule[] syntaxRuleArr = new SyntaxRule[1];
        syntaxRuleArr[0] = new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\b", new Object[0], 1), "\u0001", "\u0011\u0018\u0004\b\u0003", new Object[]{PairWithPosition.make(Lit46, Pair.make(Lit47, Pair.make(Pair.make(Lit48, Pair.make((SimpleSymbol) new SimpleSymbol("rewriteBody").readResolve(), LList.Empty)), LList.Empty)), "/u2/home/jis/ai2-kawa/kawa/lib/prim_syntax.scm", 270343)}, 0);
        Lit12 = new SyntaxRules(objArr, syntaxRuleArr, 1);
        objArr = new Object[1];
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("syntax->expression").readResolve();
        Lit9 = simpleSymbol;
        objArr[0] = simpleSymbol;
        syntaxRuleArr = new SyntaxRule[1];
        syntaxRuleArr[0] = new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\b", new Object[0], 1), "\u0001", "\u0011\u0018\u0004\b\u0003", new Object[]{PairWithPosition.make(Lit46, Pair.make(Lit47, Pair.make(Pair.make(Lit48, Pair.make((SimpleSymbol) new SimpleSymbol("rewrite").readResolve(), LList.Empty)), LList.Empty)), "/u2/home/jis/ai2-kawa/kawa/lib/prim_syntax.scm", 249863)}, 0);
        Lit10 = new SyntaxRules(objArr, syntaxRuleArr, 1);
        Lit8 = (SimpleSymbol) new SimpleSymbol("syntax-error").readResolve();
        objArr = new Object[3];
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("define-constant").readResolve();
        Lit6 = simpleSymbol;
        objArr[0] = simpleSymbol;
        objArr[1] = Lit49;
        objArr[2] = Lit46;
        syntaxRuleArr = new SyntaxRule[5];
        Object[] objArr2 = new Object[]{Lit50, Lit46, Lit51};
        syntaxRuleArr[0] = new SyntaxRule(new SyntaxPattern("\f\u0018\\\f\u0002\f\u0007,\f\u000f\f\u0017\b\b\f\n\f\u001f\f'\b", new Object[]{Lit46, Lit49}, 5), "\u0001\u0001\u0001\u0001\u0001", "\u0011\u0018\u0004Q\u0011\u0018\f\t\u0003\b\t\u000b\b\u0013\u0011\u0018\u0014\t\u001b\b#", objArr2, 0);
        Object[] objArr3 = new Object[]{Lit46};
        objArr2 = new Object[]{Lit50, Lit46, Lit52, new SyntaxRule(new SyntaxPattern("\f\u0018\\\f\u0002\f\u0007,\f\u000f\f\u0017\b\b\f\u001f\b", objArr3, 4), "\u0001\u0001\u0001\u0001", "\u0011\u0018\u0004Q\u0011\u0018\f\t\u0003\b\t\u000b\b\u0013\u0011\u0018\u0014\u0011\u0018\u001c\b\u001b", objArr2, 0)};
        syntaxRuleArr[2] = new SyntaxRule(new SyntaxPattern("\f\u0018\u001c\f\u0007\u000b\u0013", new Object[0], 3), "\u0001\u0000\u0000", "\u0011\u0018\u0004\t\u0003\u0011\u0018\f\u0011\u0018\u0014\t\n\u0012", new Object[]{Lit50, IntNum.make(10), Boolean.TRUE}, 0);
        objArr2 = new Object[]{Lit50, Lit51};
        syntaxRuleArr[3] = new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u0002\f\u000f\f\u0017\b", new Object[]{Lit49}, 3), "\u0001\u0001\u0001", "\u0011\u0018\u0004\t\u0003\u0011\u0018\f\t\u000b\b\u0013", objArr2, 0);
        objArr2 = new Object[]{Lit50, Lit52, new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\b", new Object[0], 2), "\u0001\u0001", "\u0011\u0018\u0004\t\u0003\u0011\u0018\f\u0011\u0018\u0014\b\u000b", objArr2, 0)};
        Lit7 = new SyntaxRules(objArr, syntaxRuleArr, 5);
        objArr = new Object[3];
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("define-private").readResolve();
        Lit4 = simpleSymbol;
        objArr[0] = simpleSymbol;
        objArr[1] = Lit49;
        objArr[2] = Lit46;
        syntaxRuleArr = new SyntaxRule[5];
        objArr2 = new Object[]{Lit50, Lit46, Lit53};
        syntaxRuleArr[0] = new SyntaxRule(new SyntaxPattern("\f\u0018\\\f\u0002\f\u0007,\f\u000f\f\u0017\b\b\f\n\f\u001f\f'\b", new Object[]{Lit46, Lit49}, 5), "\u0001\u0001\u0001\u0001\u0001", "\u0011\u0018\u0004Q\u0011\u0018\f\t\u0003\b\t\u000b\b\u0013\u0011\u0018\u0014\t\u001b\b#", objArr2, 0);
        objArr3 = new Object[]{Lit46};
        objArr2 = new Object[]{Lit50, Lit46, Lit54, new SyntaxRule(new SyntaxPattern("\f\u0018\\\f\u0002\f\u0007,\f\u000f\f\u0017\b\b\f\u001f\b", objArr3, 4), "\u0001\u0001\u0001\u0001", "\u0011\u0018\u0004Q\u0011\u0018\f\t\u0003\b\t\u000b\b\u0013\u0011\u0018\u0014\u0011\u0018\u001c\b\u001b", objArr2, 0)};
        syntaxRuleArr[2] = new SyntaxRule(new SyntaxPattern("\f\u0018\u001c\f\u0007\u000b\u0013", new Object[0], 3), "\u0001\u0000\u0000", "\u0011\u0018\u0004\t\u0003\u0011\u0018\f\u0011\u0018\u0014\t\n\u0012", new Object[]{Lit50, IntNum.make(6), Boolean.TRUE}, 0);
        objArr2 = new Object[]{Lit50, Lit53};
        syntaxRuleArr[3] = new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u0002\f\u000f\f\u0017\b", new Object[]{Lit49}, 3), "\u0001\u0001\u0001", "\u0011\u0018\u0004\t\u0003\u0011\u0018\f\t\u000b\b\u0013", objArr2, 0);
        objArr2 = new Object[]{Lit50, Lit54, new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\b", new Object[0], 2), "\u0001\u0001", "\u0011\u0018\u0004\t\u0003\u0011\u0018\f\u0011\u0018\u0014\b\u000b", objArr2, 0)};
        Lit5 = new SyntaxRules(objArr, syntaxRuleArr, 5);
        objArr = new Object[3];
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("define").readResolve();
        Lit2 = simpleSymbol;
        objArr[0] = simpleSymbol;
        objArr[1] = Lit49;
        objArr[2] = Lit46;
        syntaxRuleArr = new SyntaxRule[5];
        objArr2 = new Object[]{Lit50, Lit46, Lit55};
        syntaxRuleArr[0] = new SyntaxRule(new SyntaxPattern("\f\u0018\\\f\u0002\f\u0007,\f\u000f\f\u0017\b\b\f\n\f\u001f\f'\b", new Object[]{Lit46, Lit49}, 5), "\u0001\u0001\u0001\u0001\u0001", "\u0011\u0018\u0004Q\u0011\u0018\f\t\u0003\b\t\u000b\b\u0013\u0011\u0018\u0014\t\u001b\b#", objArr2, 0);
        objArr3 = new Object[]{Lit46};
        objArr2 = new Object[]{Lit50, Lit46, Lit56, new SyntaxRule(new SyntaxPattern("\f\u0018\\\f\u0002\f\u0007,\f\u000f\f\u0017\b\b\f\u001f\b", objArr3, 4), "\u0001\u0001\u0001\u0001", "\u0011\u0018\u0004Q\u0011\u0018\f\t\u0003\b\t\u000b\b\u0013\u0011\u0018\u0014\u0011\u0018\u001c\b\u001b", objArr2, 0)};
        syntaxRuleArr[2] = new SyntaxRule(new SyntaxPattern("\f\u0018\u001c\f\u0007\u000b\u0013", new Object[0], 3), "\u0001\u0000\u0000", "\u0011\u0018\u0004\t\u0003\u0011\u0018\f\u0011\u0018\u0014\t\n\u0012", new Object[]{Lit50, IntNum.make(2), Boolean.TRUE}, 0);
        objArr2 = new Object[]{Lit50, Lit55};
        syntaxRuleArr[3] = new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u0002\f\u000f\f\u0017\b", new Object[]{Lit49}, 3), "\u0001\u0001\u0001", "\u0011\u0018\u0004\t\u0003\u0011\u0018\f\t\u000b\b\u0013", objArr2, 0);
        objArr2 = new Object[]{Lit50, Lit56, new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\b", new Object[0], 2), "\u0001\u0001", "\u0011\u0018\u0004\t\u0003\u0011\u0018\f\u0011\u0018\u0014\b\u000b", objArr2, 0)};
        Lit3 = new SyntaxRules(objArr, syntaxRuleArr, 5);
        objArr = new Object[2];
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("define-syntax").readResolve();
        Lit0 = simpleSymbol;
        objArr[0] = simpleSymbol;
        objArr[1] = Lit46;
        syntaxRuleArr = new SyntaxRule[4];
        objArr2 = new Object[]{Lit57, Lit46, Lit58};
        syntaxRuleArr[0] = new SyntaxRule(new SyntaxPattern("\f\u0018l\\\f\u0002\f\u0007,\f\u000f\f\u0017\b\b\u001b#", new Object[]{Lit46}, 5), "\u0001\u0001\u0001\u0000\u0000", "\u0011\u0018\u0004Q\u0011\u0018\f\t\u0003\b\t\u000b\b\u0013\b\u0011\u0018\u0014\t\u001a\"", objArr2, 0);
        objArr2 = new Object[]{Lit57, Lit46};
        syntaxRuleArr[1] = new SyntaxRule(new SyntaxPattern("\f\u0018\\\f\u0002\f\u0007,\f\u000f\f\u0017\b\b\f\u001f\b", new Object[]{Lit46}, 4), "\u0001\u0001\u0001\u0001", "\u0011\u0018\u0004Q\u0011\u0018\f\t\u0003\b\t\u000b\b\u0013\b\u001b", objArr2, 0);
        syntaxRuleArr[2] = new SyntaxRule(new SyntaxPattern("\f\u0018\u001c\f\u0007\u000b\u0013", new Object[0], 3), "\u0001\u0000\u0000", "\u0011\u0018\u0004\t\u0003\b\u0011\u0018\f\t\n\u0012", new Object[]{Lit57, Lit58}, 0);
        syntaxRuleArr[3] = new SyntaxRule(new SyntaxPattern("\f\u0018\f\u0007\f\u000f\b", new Object[0], 2), "\u0001\u0001", "\u0011\u0018\u0004\t\u0003\b\u000b", new Object[]{Lit57}, 0);
        Lit1 = new SyntaxRules(objArr, syntaxRuleArr, 5);
        $instance = new prim_syntax();
        define$Mnsyntax = Macro.make(Lit0, Lit1, $instance);
        define = Macro.make(Lit2, Lit3, $instance);
        define$Mnprivate = Macro.make(Lit4, Lit5, $instance);
        define$Mnconstant = Macro.make(Lit6, Lit7, $instance);
        ModuleBody moduleBody = $instance;
        syntax$Mnerror = new ModuleMethod(moduleBody, 1, Lit8, -4095);
        syntax$Mn$Grexpression = Macro.make(Lit9, Lit10, $instance);
        syntax$Mnbody$Mn$Grexpression = Macro.make(Lit11, Lit12, $instance);
        simpleSymbol = Lit13;
        PropertySet moduleMethod = new ModuleMethod(moduleBody, 2, null, 4097);
        moduleMethod.setProperty("source-location", "/u2/home/jis/ai2-kawa/kawa/lib/prim_syntax.scm:69");
        f96if = Macro.make(simpleSymbol, moduleMethod, $instance);
        simpleSymbol = Lit25;
        moduleMethod = new ModuleMethod(moduleBody, 3, null, 4097);
        moduleMethod.setProperty("source-location", "/u2/home/jis/ai2-kawa/kawa/lib/prim_syntax.scm:89");
        try$Mncatch = Macro.make(simpleSymbol, moduleMethod, $instance);
        simpleSymbol = Lit29;
        moduleMethod = new ModuleMethod(moduleBody, 4, null, 4097);
        moduleMethod.setProperty("source-location", "/u2/home/jis/ai2-kawa/kawa/lib/prim_syntax.scm:98");
        letrec = Macro.make(simpleSymbol, moduleMethod, $instance);
        $instance.run();
    }

    public prim_syntax() {
        ModuleInfo.register(this);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
    }

    public static Expression syntaxError(Object id, Object... msg) {
        return syntax_error.error(id, msg);
    }

    public Object applyN(ModuleMethod moduleMethod, Object[] objArr) {
        if (moduleMethod.selector != 1) {
            return super.applyN(moduleMethod, objArr);
        }
        Object obj = objArr[0];
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        while (true) {
            length--;
            if (length < 0) {
                return syntaxError(obj, objArr2);
            }
            objArr2[length] = objArr[length + 1];
        }
    }

    public int matchN(ModuleMethod moduleMethod, Object[] objArr, CallContext callContext) {
        if (moduleMethod.selector != 1) {
            return super.matchN(moduleMethod, objArr, callContext);
        }
        callContext.values = objArr;
        callContext.proc = moduleMethod;
        callContext.pc = 5;
        return 0;
    }

    static Object lambda1(Object x) {
        Object[] allocVars = SyntaxPattern.allocVars(6, null);
        if (Lit14.match(x, allocVars, 0)) {
            return new IfExp(SyntaxForms.rewrite(Lit15.execute(allocVars, TemplateScope.make())), SyntaxForms.rewrite(Lit16.execute(allocVars, TemplateScope.make())), null);
        } else if (Lit17.match(x, allocVars, 0)) {
            return new IfExp(SyntaxForms.rewrite(Lit18.execute(allocVars, TemplateScope.make())), SyntaxForms.rewrite(Lit19.execute(allocVars, TemplateScope.make())), SyntaxForms.rewrite(Lit20.execute(allocVars, TemplateScope.make())));
        } else if (Lit21.match(x, allocVars, 0)) {
            r2 = Lit22.execute(allocVars, TemplateScope.make());
            r0 = "too many expressions for 'if'";
            if (r0 instanceof Object[]) {
                r0 = (Object[]) r0;
            } else {
                r0 = new Object[]{r0};
            }
            return syntaxError(r2, r0);
        } else if (!Lit23.match(x, allocVars, 0)) {
            return syntax_case.error("syntax-case", x);
        } else {
            r2 = Lit24.execute(allocVars, TemplateScope.make());
            r0 = "too few expressions for 'if'";
            if (r0 instanceof Object[]) {
                r0 = (Object[]) r0;
            } else {
                r0 = new Object[]{r0};
            }
            return syntaxError(r2, r0);
        }
    }

    public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
        switch (moduleMethod.selector) {
            case SetExp.DEFINING_FLAG /*2*/:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.pc = 1;
                return 0;
            case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.pc = 1;
                return 0;
            case SetExp.GLOBAL_FLAG /*4*/:
                callContext.value1 = obj;
                callContext.proc = moduleMethod;
                callContext.pc = 1;
                return 0;
            default:
                return super.match1(moduleMethod, obj, callContext);
        }
    }

    static Object lambda2(Object x) {
        Object[] allocVars = SyntaxPattern.allocVars(5, null);
        if (!Lit26.match(x, allocVars, 0)) {
            return syntax_case.error("syntax-case", x);
        }
        return try_catch.rewrite(Lit27.execute(allocVars, TemplateScope.make()), Lit28.execute(allocVars, TemplateScope.make()));
    }

    static Object lambda3(Object form) {
        frame kawa_lib_prim_syntax_frame = new frame();
        LList lList = LList.Empty;
        kawa_lib_prim_syntax_frame.out$Mninits = LList.Empty;
        kawa_lib_prim_syntax_frame.out$Mnbindings = lList;
        kawa_lib_prim_syntax_frame.$unnamed$0 = SyntaxPattern.allocVars(3, null);
        if (!Lit30.match(form, kawa_lib_prim_syntax_frame.$unnamed$0, 0)) {
            return syntax_case.error("syntax-case", form);
        }
        kawa_lib_prim_syntax_frame.lambda4processBinding(Lit31.execute(kawa_lib_prim_syntax_frame.$unnamed$0, TemplateScope.make()));
        kawa_lib_prim_syntax_frame.out$Mnbindings = LList.reverseInPlace(kawa_lib_prim_syntax_frame.out$Mnbindings);
        kawa_lib_prim_syntax_frame.out$Mninits = LList.reverseInPlace(kawa_lib_prim_syntax_frame.out$Mninits);
        Object[] objArr = new Object[2];
        objArr[0] = Lit32.execute(kawa_lib_prim_syntax_frame.$unnamed$0, TemplateScope.make());
        Object[] objArr2 = new Object[2];
        objArr2[0] = kawa_lib_prim_syntax_frame.out$Mnbindings;
        objArr2[1] = Quote.append$V(new Object[]{kawa_lib_prim_syntax_frame.out$Mninits, Lit33.execute(kawa_lib_prim_syntax_frame.$unnamed$0, r1)});
        objArr[1] = Quote.consX$V(objArr2);
        return Quote.append$V(objArr);
    }

    public Object apply1(ModuleMethod moduleMethod, Object obj) {
        switch (moduleMethod.selector) {
            case SetExp.DEFINING_FLAG /*2*/:
                return lambda1(obj);
            case XDataType.ANY_ATOMIC_TYPE_CODE /*3*/:
                return lambda2(obj);
            case SetExp.GLOBAL_FLAG /*4*/:
                return lambda3(obj);
            default:
                return super.apply1(moduleMethod, obj);
        }
    }
}
