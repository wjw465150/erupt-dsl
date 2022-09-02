package xyz.erupt.jpa.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMetaModelVo is a Querydsl query type for MetaModelVo
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QMetaModelVo extends EntityPathBase<MetaModelVo> {

    private static final long serialVersionUID = -2034694802L;

    public static final QMetaModelVo metaModelVo = new QMetaModelVo("metaModelVo");

    public final QMetaModel _super = new QMetaModel(this);

    public final StringPath createBy = createString("createBy");

    public final DateTimePath<java.time.LocalDateTime> createTime = createDateTime("createTime", java.time.LocalDateTime.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath updateBy = createString("updateBy");

    public final DateTimePath<java.time.LocalDateTime> updateTime = createDateTime("updateTime", java.time.LocalDateTime.class);

    public QMetaModelVo(String variable) {
        super(MetaModelVo.class, forVariable(variable));
    }

    public QMetaModelVo(Path<? extends MetaModelVo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMetaModelVo(PathMetadata metadata) {
        super(MetaModelVo.class, metadata);
    }

}

