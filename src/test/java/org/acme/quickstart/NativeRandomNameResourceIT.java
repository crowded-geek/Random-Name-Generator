package org.acme.quickstart;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeRandomNameResourceIT extends RandomNameResourceTest {

    // Execute the same tests but in native mode.
}