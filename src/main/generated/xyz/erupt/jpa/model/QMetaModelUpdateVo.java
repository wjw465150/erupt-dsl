package xyz.erupt.jpa.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMetaModelUpdateVo is a Querydsl query type for MetaModelUpdateVo
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QMetaModelUpdateVo extends EntityPathBase<MetaModelUpdateVo> {

    private static final long serialVersionUID = -1891266473L;

    public static final QMetaModelUpdateVo metaModelUpdateVo = new QMetaModelUpdateVo("metaModelUpdateVo");

    public final QMetaModel _super = new QMetaModel(this);

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath updateBy = createString("updateBy");

    public final DateTimePath<java.time.LocalDateTime> updateTime = createDateTime("updateTime", java.time.LocalDateTime.class);

    public QMetaModelUpdateVo(String variable) {
        super(MetaModelUpdateVo.class, forVariable(variable));
    }

    public QMetaModelUpdateVo(Path<? extends MetaModelUpdateVo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMetaModelUpdateVo(PathMetadata metadata) {
        super(MetaModelUpdateVo.class, metadata);
    }

}

