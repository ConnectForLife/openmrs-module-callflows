package org.openmrs.module.callflows.api.builder;

import org.junit.Before;
import org.junit.Test;
import org.openmrs.module.callflows.BaseTest;
import org.openmrs.module.callflows.Constants;
import org.openmrs.module.callflows.api.contract.RendererContract;
import org.openmrs.module.callflows.api.domain.Renderer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Renderer Builder Test
 *
 * @author bramak09
 */
public class RendererBuilderTest extends BaseTest {

    private RendererContract rendererContract;

    @Before
    public void setUp() {
        // Given
        rendererContract = new RendererContract();
        rendererContract.setName(Constants.CONFIG_RENDERER_VXML);
        rendererContract.setMimeType(Constants.CONFIG_RENDERER_VXML_MIME);
        rendererContract.setTemplate(Constants.CONFIG_RENDERER_VXML_TPL);
    }

    @Test
    public void shouldBuildRenderer() {
        // When
        Renderer renderer = RendererBuilder.createFrom(rendererContract);

        // Then
        assertThat(renderer.getName(), equalTo(rendererContract.getName()));
        assertThat(renderer.getMimeType(), equalTo(rendererContract.getMimeType()));
        assertThat(renderer.getTemplate(), equalTo(rendererContract.getTemplate()));
    }
}

