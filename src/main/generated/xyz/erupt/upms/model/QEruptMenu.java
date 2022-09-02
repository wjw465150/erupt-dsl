package xyz.erupt.upms.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEruptMenu is a Querydsl query type for EruptMenu
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptMenu extends EntityPathBase<EruptMenu> {

    private static final long serialVersionUID = -270282096L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEruptMenu eruptMenu = new QEruptMenu("eruptMenu");

    public final xyz.erupt.jpa.model.QMetaModel _super = new xyz.erupt.jpa.model.QMetaModel(this);

    public final StringPath code = createString("code");

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    public final StringPath icon = createString("icon");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final StringPath param = createString("param");

    public final QEruptMenu parentMenu;

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath type = createString("type");

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public final StringPath value = createString("value");

    public QEruptMenu(String variable) {
        this(EruptMenu.class, forVariable(variable), INITS);
    }

    public QEruptMenu(Path<? extends EruptMenu> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEruptMenu(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEruptMenu(PathMetadata metadata, PathInits inits) {
        this(EruptMenu.class, metadata, inits);
    }

    public QEruptMenu(Class<? extends EruptMenu> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parentMenu = inits.isInitialized("parentMenu") ? new QEruptMenu(forProperty("parentMenu"), inits.get("parentMenu")) : null;
    }

}

