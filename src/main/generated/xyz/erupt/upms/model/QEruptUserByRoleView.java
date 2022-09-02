package xyz.erupt.upms.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEruptUserByRoleView is a Querydsl query type for EruptUserByRoleView
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptUserByRoleView extends EntityPathBase<EruptUserByRoleView> {

    private static final long serialVersionUID = 617916366L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEruptUserByRoleView eruptUserByRoleView = new QEruptUserByRoleView("eruptUserByRoleView");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final StringPath account = createString("account");

    public final QEruptOrg eruptOrg;

    public final QEruptPost eruptPost;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final BooleanPath isAdmin = createBoolean("isAdmin");

    public final StringPath name = createString("name");

    public final BooleanPath status = createBoolean("status");

    public QEruptUserByRoleView(String variable) {
        this(EruptUserByRoleView.class, forVariable(variable), INITS);
    }

    public QEruptUserByRoleView(Path<? extends EruptUserByRoleView> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEruptUserByRoleView(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEruptUserByRoleView(PathMetadata metadata, PathInits inits) {
        this(EruptUserByRoleView.class, metadata, inits);
    }

    public QEruptUserByRoleView(Class<? extends EruptUserByRoleView> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.eruptOrg = inits.isInitialized("eruptOrg") ? new QEruptOrg(forProperty("eruptOrg"), inits.get("eruptOrg")) : null;
        this.eruptPost = inits.isInitialized("eruptPost") ? new QEruptPost(forProperty("eruptPost")) : null;
    }

}

