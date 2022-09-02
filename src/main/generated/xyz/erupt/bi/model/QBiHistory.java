package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBiHistory is a Querydsl query type for BiHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBiHistory extends EntityPathBase<BiHistory> {

    private static final long serialVersionUID = 1660421240L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBiHistory biHistory = new QBiHistory("biHistory");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final QBaseBi bi;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath mark = createString("mark");

    public final StringPath operateBy = createString("operateBy");

    public final DateTimePath<java.util.Date> operateTime = createDateTime("operateTime", java.util.Date.class);

    public final StringPath sqlStatement = createString("sqlStatement");

    public QBiHistory(String variable) {
        this(BiHistory.class, forVariable(variable), INITS);
    }

    public QBiHistory(Path<? extends BiHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBiHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBiHistory(PathMetadata metadata, PathInits inits) {
        this(BiHistory.class, metadata, inits);
    }

    public QBiHistory(Class<? extends BiHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bi = inits.isInitialized("bi") ? new QBaseBi(forProperty("bi")) : null;
    }

}

