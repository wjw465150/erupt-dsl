package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBiDimensionReference is a Querydsl query type for BiDimensionReference
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBiDimensionReference extends EntityPathBase<BiDimensionReference> {

    private static final long serialVersionUID = -1394250207L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBiDimensionReference biDimensionReference = new QBiDimensionReference("biDimensionReference");

    public final xyz.erupt.jpa.model.QMetaModelUpdateVo _super = new xyz.erupt.jpa.model.QMetaModelUpdateVo(this);

    public final QBiClassHandler classHandler;

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    public final QBiDataSource dataSource;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath refSql = createString("refSql");

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QBiDimensionReference(String variable) {
        this(BiDimensionReference.class, forVariable(variable), INITS);
    }

    public QBiDimensionReference(Path<? extends BiDimensionReference> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBiDimensionReference(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBiDimensionReference(PathMetadata metadata, PathInits inits) {
        this(BiDimensionReference.class, metadata, inits);
    }

    public QBiDimensionReference(Class<? extends BiDimensionReference> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.classHandler = inits.isInitialized("classHandler") ? new QBiClassHandler(forProperty("classHandler")) : null;
        this.dataSource = inits.isInitialized("dataSource") ? new QBiDataSource(forProperty("dataSource")) : null;
    }

}

