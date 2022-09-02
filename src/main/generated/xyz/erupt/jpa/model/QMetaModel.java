package xyz.erupt.jpa.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMetaModel is a Querydsl query type for MetaModel
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QMetaModel extends EntityPathBase<MetaModel> {

    private static final long serialVersionUID = -529490987L;

    public static final QMetaModel metaModel = new QMetaModel("metaModel");

    public final QBaseModel _super = new QBaseModel(this);

    public final StringPath createBy = createString("createBy");

    public final DateTimePath<java.time.LocalDateTime> createTime = createDateTime("createTime", java.time.LocalDateTime.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath updateBy = createString("updateBy");

    public final DateTimePath<java.time.LocalDateTime> updateTime = createDateTime("updateTime", java.time.LocalDateTime.class);

    public QMetaModel(String variable) {
        super(MetaModel.class, forVariable(variable));
    }

    public QMetaModel(Path<? extends MetaModel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMetaModel(PathMetadata metadata) {
        super(MetaModel.class, metadata);
    }

}

