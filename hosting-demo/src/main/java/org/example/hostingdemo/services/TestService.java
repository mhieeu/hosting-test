package org.example.hostingdemo.services;

import org.example.hostingdemo.model.TestModel;
import org.example.hostingdemo.services.impl.TestServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TestService implements TestServiceImpl {

    @Override
    public TestModel getTestModel(TestModel testModel) {
        return testModel;
    }
}
