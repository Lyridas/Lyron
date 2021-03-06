package translator;

import exception.PLDLAnalysisException;
import exception.PLDLParsingException;
import parser.AnalysisNode;
import parser.CFGProduction;

public abstract class MovementProduction extends CFGProduction {

    public MovementProduction(CFGProduction production) {
        super(production);
    }

    public abstract void doMovement(AnalysisNode movementRoot, AnalysisNode parsingTreeRoot) throws PLDLParsingException, PLDLAnalysisException;
}
