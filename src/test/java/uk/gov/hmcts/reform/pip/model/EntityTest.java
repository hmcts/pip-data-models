package uk.gov.hmcts.reform.pip.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedEntityRole;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedEntityRoleType;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedEntityType;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;
import uk.gov.hmcts.reform.pip.model.enums.Classification;
import uk.gov.hmcts.reform.pip.model.enums.EntityRole;
import uk.gov.hmcts.reform.pip.model.enums.EntityRoleType;
import uk.gov.hmcts.reform.pip.model.enums.EntityType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityTest {

    private ClassifiedString classifiedString;
    private ClassifiedEntityType classifiedEntityType;
    private ClassifiedEntityRoleType classifiedEntityRoleType;
    private ClassifiedEntityRole classifiedEntityRole;

    @BeforeEach
    public void setClassifiedFields() {
        classifiedString = new ClassifiedString();
        classifiedString.setClassification(Classification.INTERNAL);
        classifiedString.setValue("TestValue");

        classifiedEntityType = new ClassifiedEntityType();
        classifiedEntityType.setClassification(Classification.INTERNAL);
        classifiedEntityType.setValue(EntityType.INDIVIDUAL);

        classifiedEntityRoleType = new ClassifiedEntityRoleType();
        classifiedEntityRoleType.setClassification(Classification.INTERNAL);
        classifiedEntityRoleType.setValue(EntityRoleType.APPELLANT);

        classifiedEntityRole = new ClassifiedEntityRole();
        classifiedEntityRole.setClassification(Classification.INTERNAL);
        classifiedEntityRole.setValue(EntityRole.APPELLANT);
    }

    @Test
    public void testEntityId() {
        Entity entity = Entity.builder().entityId(2).build();
        assertEquals(2, entity.getEntityId(), "Entity ID should be set");
    }

    @Test
    public void testClassification() {
        Entity entity = Entity.builder().classification(Classification.INTERNAL).build();
        assertEquals(Classification.INTERNAL, entity.getClassification(), "Classification should be set");
    }

    @Test
    public void testName() {
        Entity entity = Entity.builder().name(classifiedString).build();
        assertEquals(classifiedString, entity.getName(), "Name should be set");
    }

    @Test
    public void testType() {
        Entity entity = Entity.builder().type(classifiedEntityType).build();
        assertEquals(classifiedEntityType, entity.getType(), "Type should be set");
    }

    @Test
    public void testRoleType() {
        Entity entity = Entity.builder().roleType(classifiedEntityRoleType).build();
        assertEquals(classifiedEntityRoleType, entity.getRoleType(), "Role Type should be set");
    }

    @Test
    public void testRole() {
        Entity entity = Entity.builder().role(classifiedEntityRole).build();
        assertEquals(classifiedEntityRole, entity.getRole(), "Role should be set");
    }

}
