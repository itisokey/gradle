/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.internal.artifacts.transform;

import org.gradle.api.attributes.AttributeContainer;
import org.gradle.api.internal.artifacts.ivyservice.resolveengine.artifact.ResolvedArtifactSet;

import java.util.Collection;

/**
 * Creates a transformation node per artifact in the given artifact set.
 */
public interface TransformationNodeFactory {

    Collection<TransformationNode> create(
        ResolvedArtifactSet artifactSet,
        ComponentVariantIdentifier targetComponentVariant,
        TransformationStep transformationStep,
        AttributeContainer sourceAttributes,
        TransformUpstreamDependenciesResolver dependenciesResolver
    );

}
