import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class L2022210108_18_Test {
    Solution18 pes = new Solution18();

    // 测试用例设计的总体原则：
    // 1. 等价类划分：
    //    - 普通的非零数组。
    //    - 包含零的数组。
    //    - 全部为 1 的数组。
    //    - 包含负数的数组。
    //    - 特殊情况：空数组，只有一个元素的数组。
    // 2. 边界值分析：
    //    - 数组的最小长度（0 或 1 个元素），以及具有两个元素的数组。

    // 测试目的：测试正常情况下的数组，确保程序正确计算除了自身以外的乘积。
    // 测试用例：nums = {1, 2, 3, 4}，期望输出为 {24, 12, 8, 6}。
    @Test
    public void testNormalArray() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals("失败", expected, pes.productExceptSelf(nums));
    }

    // 测试目的：验证包含 0 的数组时，是否正确处理 0 的乘积问题。
    // 测试用例：nums = {1, 2, 0, 4}，期望输出为 {0, 0, 8, 0}。
    @Test
    public void testArrayWithZero() {
        int[] nums = {1, 2, 0, 4};
        int[] expected = {0, 0, 8, 0};
        assertArrayEquals("失败", expected, pes.productExceptSelf(nums));
    }

    // 测试目的：测试数组中所有元素都为 1 时，确保乘积结果正确。
    // 测试用例：nums = {1, 1, 1, 1}，期望输出为 {1, 1, 1, 1}。
    @Test
    public void testAllOnes() {
        int[] nums = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        assertArrayEquals("失败", expected, pes.productExceptSelf(nums));
    }

    // 测试目的：验证数组中包含负数的情况，确保乘积结果正确。
    // 测试用例：nums = {-1, -2, -3, -4}，期望输出为 {-24, -12, -8, -6}。
    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4};
        int[] expected = {-24, -12, -8, -6};
        assertArrayEquals("失败", expected, pes.productExceptSelf(nums));
    }

    // 测试目的：验证空数组时的处理，确保程序不会抛出异常。
    // 测试用例：nums = {}，期望输出为空数组 {}。
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int[] expected = {};
        assertArrayEquals("失败", expected, pes.productExceptSelf(nums));
    }

    // 测试目的：验证数组中只有一个元素时，确保输出为 1，因为没有其他元素。
    // 测试用例：nums = {5}，期望输出为 {1}。
    @Test
    public void testSingleElement() {
        int[] nums = {5};
        int[] expected = {1};  // 只有一个元素时，结果应该是1
        assertArrayEquals("失败", expected, pes.productExceptSelf(nums));
    }

    // 测试目的：验证数组中只有两个元素时，确保程序能够正确处理乘积。
    // 测试用例：nums = {3, 4}，期望输出为 {4, 3}。
    @Test
    public void testTwoElements() {
        int[] nums = {3, 4};
        int[] expected = {4, 3};
        assertArrayEquals("失败", expected, pes.productExceptSelf(nums));
    }
}
