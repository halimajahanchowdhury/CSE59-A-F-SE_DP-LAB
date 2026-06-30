// Interface

interface OptimizableModel {
    void quantize();
}

// Resnet18 class

class Resnet18 implements OptimizableModel {

    @Override

    public void quantize() {
        System.out.println("Applying int8 quantization for Resnet-18.");
    }
}

// MobileNet class

class MobileNet implements OptimizableModel {

    @Override

    public void quantize() {
        System.out.println("Applying dynamic quantization for MobileNet.");
    }
}

// InferenceEngine class
class InferenceEngine {
    public void optimizeModel(OptimizableModel model) {
        model.quantize();
    }
}

// Main class

public class Main {
    public static void main(String[] args) {
        InferenceEngine engine = new InferenceEngine();

        OptimizableModel resnet = new Resnet18();
        OptimizableModel mobilenet = new MobileNet();

        engine.optimizeModel(resnet);
        engine.optimizeModel(mobilenet);
    }
}
