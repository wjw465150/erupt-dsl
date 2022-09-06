package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBiHistory is a Querydsl query type for BiHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBiHistory extends EntityPathBase<BiHistory> {

    private static final long serialVersionUID = 1660421240L;

    public static final QBiHistory biHistory = new QBiHistory("biHistory");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final NumberPath<Long> biId = createNumber("biId", Long.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath mark = createString("mark");

    public final StringPath operateBy = createString("operateBy");

    public final DateTimePath<java.util.Date> operateTime = createDateTime("operateTime", java.util.Date.class);

    public final StringPath sqlStatement = createString("sqlStatement");

    public QBiHistory(String variable) {
        super(BiHistory.class, forVariable(variable));
    }

    public QBiHistory(Path<? extends BiHistory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBiHistory(PathMetadata metadata) {
        super(BiHistory.class, metadata);
    }

}

