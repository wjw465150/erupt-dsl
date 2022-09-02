package xyz.erupt.upms.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEruptDict is a Querydsl query type for EruptDict
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptDict extends EntityPathBase<EruptDict> {

    private static final long serialVersionUID = -270546713L;

    public static final QEruptDict eruptDict = new QEruptDict("eruptDict");

    public final xyz.erupt.jpa.model.QMetaModelUpdateVo _super = new xyz.erupt.jpa.model.QMetaModelUpdateVo(this);

    public final StringPath code = createString("code");

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath remark = createString("remark");

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QEruptDict(String variable) {
        super(EruptDict.class, forVariable(variable));
    }

    public QEruptDict(Path<? extends EruptDict> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEruptDict(PathMetadata metadata) {
        super(EruptDict.class, metadata);
    }

}

