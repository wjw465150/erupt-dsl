package xyz.erupt.upms.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEruptRole is a Querydsl query type for EruptRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptRole extends EntityPathBase<EruptRole> {

    private static final long serialVersionUID = -270123609L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEruptRole eruptRole = new QEruptRole("eruptRole");

    public final xyz.erupt.upms.helper.QHyperModelUpdateVo _super;

    public final StringPath code = createString("code");

    //inherited
    public final DateTimePath<java.util.Date> createTime;

    // inherited
    public final QEruptUserVo createUser;

    //inherited
    public final NumberPath<Long> id;

    public final SetPath<EruptMenu, QEruptMenu> menus = this.<EruptMenu, QEruptMenu>createSet("menus", EruptMenu.class, QEruptMenu.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public final BooleanPath status = createBoolean("status");

    //inherited
    public final DateTimePath<java.util.Date> updateTime;

    // inherited
    public final QEruptUserVo updateUser;

    public final SetPath<EruptUserByRoleView, QEruptUserByRoleView> users = this.<EruptUserByRoleView, QEruptUserByRoleView>createSet("users", EruptUserByRoleView.class, QEruptUserByRoleView.class, PathInits.DIRECT2);

    public QEruptRole(String variable) {
        this(EruptRole.class, forVariable(variable), INITS);
    }

    public QEruptRole(Path<? extends EruptRole> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEruptRole(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEruptRole(PathMetadata metadata, PathInits inits) {
        this(EruptRole.class, metadata, inits);
    }

    public QEruptRole(Class<? extends EruptRole> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new xyz.erupt.upms.helper.QHyperModelUpdateVo(type, metadata, inits);
        this.createTime = _super.createTime;
        this.createUser = _super.createUser;
        this.id = _super.id;
        this.updateTime = _super.updateTime;
        this.updateUser = _super.updateUser;
    }

}

