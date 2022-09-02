package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBiClassHandler is a Querydsl query type for BiClassHandler
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBiClassHandler extends EntityPathBase<BiClassHandler> {

    private static final long serialVersionUID = -33596082L;

    public static final QBiClassHandler biClassHandler = new QBiClassHandler("biClassHandler");

    public final xyz.erupt.jpa.model.QMetaModelUpdateVo _super = new xyz.erupt.jpa.model.QMetaModelUpdateVo(this);

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    public final StringPath handlerPath = createString("handlerPath");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath param = createString("param");

    public final StringPath remark = createString("remark");

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QBiClassHandler(String variable) {
        super(BiClassHandler.class, forVariable(variable));
    }

    public QBiClassHandler(Path<? extends BiClassHandler> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBiClassHandler(PathMetadata metadata) {
        super(BiClassHandler.class, metadata);
    }

}

