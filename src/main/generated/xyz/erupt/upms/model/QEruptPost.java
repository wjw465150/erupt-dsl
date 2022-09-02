package xyz.erupt.upms.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEruptPost is a Querydsl query type for EruptPost
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptPost extends EntityPathBase<EruptPost> {

    private static final long serialVersionUID = -270182959L;

    public static final QEruptPost eruptPost = new QEruptPost("eruptPost");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> weight = createNumber("weight", Integer.class);

    public QEruptPost(String variable) {
        super(EruptPost.class, forVariable(variable));
    }

    public QEruptPost(Path<? extends EruptPost> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEruptPost(PathMetadata metadata) {
        super(EruptPost.class, metadata);
    }

}

