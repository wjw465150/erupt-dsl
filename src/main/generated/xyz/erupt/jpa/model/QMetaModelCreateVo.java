package xyz.erupt.jpa.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMetaModelCreateVo is a Querydsl query type for MetaModelCreateVo
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QMetaModelCreateVo extends EntityPathBase<MetaModelCreateVo> {

    private static final long serialVersionUID = -1393444918L;

    public static final QMetaModelCreateVo metaModelCreateVo = new QMetaModelCreateVo("metaModelCreateVo");

    public final QMetaModel _super = new QMetaModel(this);

    public final StringPath createBy = createString("createBy");

    public final DateTimePath<java.time.LocalDateTime> createTime = createDateTime("createTime", java.time.LocalDateTime.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QMetaModelCreateVo(String variable) {
        super(MetaModelCreateVo.class, forVariable(variable));
    }

    public QMetaModelCreateVo(Path<? extends MetaModelCreateVo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMetaModelCreateVo(PathMetadata metadata) {
        super(MetaModelCreateVo.class, metadata);
    }

}

