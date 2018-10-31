package ontology.solvers.backend.z3.encoder;

import checkers.inference.solver.backend.z3.Z3BitVectorFormatTranslator;
import checkers.inference.solver.backend.z3.encoder.Z3BitVectorConstraintEncoderFactory;
import checkers.inference.solver.backend.z3.encoder.Z3BitVectorSubtypeConstraintEncoder;
import checkers.inference.solver.frontend.Lattice;
import com.microsoft.z3.Context;

public class OntologyZ3BitVectorConstraintEncoderFactory
        extends Z3BitVectorConstraintEncoderFactory {

    public OntologyZ3BitVectorConstraintEncoderFactory(
            Lattice lattice, Context context, Z3BitVectorFormatTranslator formatTranslator) {
        super(lattice, context, formatTranslator);
    }

    @Override
    public Z3BitVectorSubtypeConstraintEncoder createSubtypeConstraintEncoder() {
        return new OntologyZ3BitVectorSubtypeConstraintEncoder(lattice, context, formatTranslator);
    }
}
