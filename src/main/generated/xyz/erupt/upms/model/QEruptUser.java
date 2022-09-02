package xyz.erupt.upms.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEruptUser is a Querydsl query type for EruptUser
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptUser extends EntityPathBase<EruptUser> {

    private static final long serialVersionUID = -270030596L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEruptUser eruptUser = new QEruptUser("eruptUser");

    public final xyz.erupt.upms.looker.QLookerSelf _super;

    public final StringPath account = createString("account");

    //inherited
    public final DateTimePath<java.util.Date> createTime;

    // inherited
    public final QEruptUserVo createUser;

    public final StringPath email = createString("email");

    public final QEruptMenu eruptMenu;

    public final QEruptOrg eruptOrg;

    public final QEruptPost eruptPost;

    //inherited
    public final NumberPath<Long> id;

    public final BooleanPath isAdmin = createBoolean("isAdmin");

    public final BooleanPath isMd5 = createBoolean("isMd5");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final StringPath remark = createString("remark");

    public final DateTimePath<java.util.Date> resetPwdTime = createDateTime("resetPwdTime", java.util.Date.class);

    public final SetPath<EruptRole, QEruptRole> roles = this.<EruptRole, QEruptRole>createSet("roles", EruptRole.class, QEruptRole.class, PathInits.DIRECT2);

    public final BooleanPath status = createBoolean("status");

    //inherited
    public final DateTimePath<java.util.Date> updateTime;

    // inherited
    public final QEruptUserVo updateUser;

    public final StringPath whiteIp = createString("whiteIp");

    public QEruptUser(String variable) {
        this(EruptUser.class, forVariable(variable), INITS);
    }

    public QEruptUser(Path<? extends EruptUser> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEruptUser(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEruptUser(PathMetadata metadata, PathInits inits) {
        this(EruptUser.class, metadata, inits);
    }

    public QEruptUser(Class<? extends EruptUser> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new xyz.erupt.upms.looker.QLookerSelf(type, metadata, inits);
        this.createTime = _super.createTime;
        this.createUser = _super.createUser;
        this.eruptMenu = inits.isInitialized("eruptMenu") ? new QEruptMenu(forProperty("eruptMenu"), inits.get("eruptMenu")) : null;
        this.eruptOrg = inits.isInitialized("eruptOrg") ? new QEruptOrg(forProperty("eruptOrg"), inits.get("eruptOrg")) : null;
        this.eruptPost = inits.isInitialized("eruptPost") ? new QEruptPost(forProperty("eruptPost")) : null;
        this.id = _super.id;
        this.updateTime = _super.updateTime;
        this.updateUser = _super.updateUser;
    }

}

