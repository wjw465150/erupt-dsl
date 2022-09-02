package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBiTpl is a Querydsl query type for BiTpl
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBiTpl extends EntityPathBase<BiTpl> {

    private static final long serialVersionUID = -1905429676L;

    public static final QBiTpl biTpl = new QBiTpl("biTpl");

    public final xyz.erupt.jpa.model.QMetaModelUpdateVo _super = new xyz.erupt.jpa.model.QMetaModelUpdateVo(this);

    public final StringPath code = createString("code");

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath path = createString("path");

    public final StringPath tpl = createString("tpl");

    public final StringPath type = createString("type");

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QBiTpl(String variable) {
        super(BiTpl.class, forVariable(variable));
    }

    public QBiTpl(Path<? extends BiTpl> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBiTpl(PathMetadata metadata) {
        super(BiTpl.class, metadata);
    }

}

