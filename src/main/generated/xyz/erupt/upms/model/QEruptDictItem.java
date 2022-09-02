package xyz.erupt.upms.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEruptDictItem is a Querydsl query type for EruptDictItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptDictItem extends EntityPathBase<EruptDictItem> {

    private static final long serialVersionUID = -141169510L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEruptDictItem eruptDictItem = new QEruptDictItem("eruptDictItem");

    public final xyz.erupt.jpa.model.QMetaModelUpdateVo _super = new xyz.erupt.jpa.model.QMetaModelUpdateVo(this);

    public final StringPath code = createString("code");

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    public final QEruptDict eruptDict;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath remark = createString("remark");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QEruptDictItem(String variable) {
        this(EruptDictItem.class, forVariable(variable), INITS);
    }

    public QEruptDictItem(Path<? extends EruptDictItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEruptDictItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEruptDictItem(PathMetadata metadata, PathInits inits) {
        this(EruptDictItem.class, metadata, inits);
    }

    public QEruptDictItem(Class<? extends EruptDictItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.eruptDict = inits.isInitialized("eruptDict") ? new QEruptDict(forProperty("eruptDict")) : null;
    }

}

