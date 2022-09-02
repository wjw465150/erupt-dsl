package xyz.erupt.upms.looker;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLookerSelf is a Querydsl query type for LookerSelf
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QLookerSelf extends EntityPathBase<LookerSelf> {

    private static final long serialVersionUID = -1419579260L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLookerSelf lookerSelf = new QLookerSelf("lookerSelf");

    public final xyz.erupt.upms.helper.QHyperModelCreatorVo _super;

    //inherited
    public final DateTimePath<java.util.Date> createTime;

    // inherited
    public final xyz.erupt.upms.model.QEruptUserVo createUser;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final DateTimePath<java.util.Date> updateTime;

    // inherited
    public final xyz.erupt.upms.model.QEruptUserVo updateUser;

    public QLookerSelf(String variable) {
        this(LookerSelf.class, forVariable(variable), INITS);
    }

    public QLookerSelf(Path<? extends LookerSelf> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLookerSelf(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLookerSelf(PathMetadata metadata, PathInits inits) {
        this(LookerSelf.class, metadata, inits);
    }

    public QLookerSelf(Class<? extends LookerSelf> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new xyz.erupt.upms.helper.QHyperModelCreatorVo(type, metadata, inits);
        this.createTime = _super.createTime;
        this.createUser = _super.createUser;
        this.id = _super.id;
        this.updateTime = _super.updateTime;
        this.updateUser = _super.updateUser;
    }

}

