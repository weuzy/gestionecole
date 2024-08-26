package com.e221.gestionecole.validation.entity;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.reflect.Field;
import java.util.UUID;

import com.e221.gestionecole.validation.ValidEntity;

public class EntityValidator implements ConstraintValidator<ValidEntity, Object> {

    private Class<?> entityType;
    @Override
    public void initialize(ValidEntity constraintAnnotation) {
        this.entityType = constraintAnnotation.type();
    }

    @Override
    public boolean isValid(Object entity, ConstraintValidatorContext constraintValidatorContext) {
        if (entity == null) {
            return false;
        }

        try {
            Field idField = entityType.getDeclaredField("id");
            idField.setAccessible(true);
            Object idValue = idField.get(entity);

            if (idValue instanceof UUID) {
                return true;
            } else if (idValue instanceof String) {
                UUID.fromString((String) idValue);
                return true;
            } else {
                return false;
            }
        } catch (NoSuchFieldException | IllegalAccessException |IllegalArgumentException |NullPointerException e) {
            return false;
        }
    }

}
