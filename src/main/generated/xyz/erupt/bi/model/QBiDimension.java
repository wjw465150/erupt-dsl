package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBiDimension is a Querydsl query type for BiDimension
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBiDimension extends EntityPathBase<BiDimension> {

    private static final long serialVersionUID = -588569526L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBiDimension biDimension = new QBiDimension("biDimension");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final QBi bi;

    public final QBiDimensionReference biDimensionReference;

    public final StringPath code = createString("code");

    public final StringPath defaultValue = createString("defaultValue");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final BooleanPath notNull = createBoolean("notNull");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final StringPath title = createString("title");

    public final StringPath type = createString("type");

    public QBiDimension(String variable) {
        this(BiDimension.class, forVariable(variable), INITS);
    }

    public QBiDimension(Path<? extends BiDimension> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBiDimension(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBiDimension(PathMetadata metadata, PathInits inits) {
        this(BiDimension.class, metadata, inits);
    }

    public QBiDimension(Class<? extends BiDimension> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bi = inits.isInitialized("bi") ? new QBi(forProperty("bi"), inits.get("bi")) : null;
        this.biDimensionReference = inits.isInitialized("biDimensionReference") ? new QBiDimensionReference(forProperty("biDimensionReference"), inits.get("biDimensionReference")) : null;
    }

}

